package com.semantic.annotator.annotation;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.semantic.annotator.correlationSeeker.OffStreetParkingSeeker;
import com.semantic.annotator.resource.OffStreetParking;
import com.semantic.annotator.resourceDTO.OffStreetParkingDTO;
import org.apache.jena.base.Sys;
import org.apache.jena.graph.Node;
import org.apache.jena.graph.NodeFactory;
import org.apache.jena.graph.Triple;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import sun.security.util.Resources;
import virtuoso.jena.driver.VirtModel;
import virtuoso.jena.driver.VirtuosoUpdateFactory;
import virtuoso.jena.driver.VirtuosoUpdateRequest;

import javax.annotation.Resource;
import java.io.*;
import java.util.*;

public class OffStreetParkingAnnotation {

    String graph_name = "http://www.city-hub.kr/ontologies/2019/1/parking#";
    String id_type = "name";
    FileReader reader = null;
    String template = "\\src\\main\\java\\com\\semantic\\annotator\\template\\OffStreetParking.json";

    static String type = "http://www.w3.org/1999/02/22-rdf-syntax-ns#type";
    static String nameIndivual_type = "http://www.w3.org/2002/07/owl#Namedindividual";
    static String url = "jdbc:virtuoso://172.20.0.129:1111";

    public OffStreetParkingAnnotation(OffStreetParking data) {

        ArrayList<String> Domain_list = new ArrayList<>();
        ArrayList<String> typeList = new ArrayList<>();

        OffStreetParkingSeeker correlationSeeker = new OffStreetParkingSeeker();
        OffStreetParkingDTO mappedOffStreetParkingDTO = correlationSeeker.map(data, OffStreetParkingDTO.class);
        System.out.println(mappedOffStreetParkingDTO);

        graph_name = graph_name + data.getId().split(":")[3];

        try {
            reader = new FileReader(System.getProperty("user.dir")+template);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Model model = ModelFactory.createDefaultModel();
        JsonParser parser = new JsonParser();

        JsonElement jsonElement = parser.parse(reader);
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        Iterator<Map.Entry<String,JsonElement>> iterator = jsonObject.entrySet().iterator();  //iterator 안에서 key, value 를 가져 올 수 있음

        while (iterator.hasNext()) {
//            System.out.println(iterator);
            Map.Entry<String, JsonElement> temp = iterator.next();
            if(temp.getValue().isJsonArray()) {
                for(int i=0; i<temp.getValue().getAsJsonArray().size(); i++) {
                    if(temp.getKey().equals("type-list")) {
                        JsonArray tempArray = temp.getValue().getAsJsonArray();
                        typeList.add(tempArray.get(i).toString().replaceAll("\"","")+"_"+data.getId().split(":")[3]);
                    } else if(temp.getKey().equals("individual-list")) {
                        JsonArray tempArray = temp.getValue().getAsJsonArray();
                        Domain_list.add(tempArray.get(i).toString().replaceAll("\"","")+"_"+data.getId().split(":")[3]);
                        Node domain = NodeFactory.createURI(tempArray.get(i).toString().replaceAll("\"","")+"_"+data.getId().split(":")[3]);
                        Node type_d = NodeFactory.createURI(type);
                        Node range = NodeFactory.createURI(typeList.get(i));

                        Triple triples = new Triple(domain, type_d, range);
                        model.add(model.asStatement(triples));

                        domain = NodeFactory.createURI(Domain_list.get(i));
                        type_d = NodeFactory.createURI(type);
                        range = NodeFactory.createURI(nameIndivual_type);

                        triples = new Triple(domain, type_d, range);
                        model.add(model.asStatement(triples));

                    } else if(temp.getKey().equals("object-properties")) {
                        JsonArray properties = temp.getValue().getAsJsonArray();
                        JsonElement triple = properties.get(i);
                        JsonObject element = triple.getAsJsonObject();

                        Node domain = NodeFactory.createURI(element.get("domain").toString().replaceAll("\"","")+"_"+data.getId().split(":")[3]);
                        Node type_d = NodeFactory.createURI(element.get("property").toString());
                        Node range;

                        if(element.get("property").toString().equals("\"http://www.w3.org/2006/time#dayOfWeek\"")) {
                            range = NodeFactory.createURI(element.get("range").toString());
                        } else {
                            range = NodeFactory.createURI(element.get("range").toString().replaceAll("\"","")+"_"+data.getId().split(":")[3]);
                        }

                        Triple triples = new Triple(domain, type_d, range);
                        model.add(model.asStatement(triples));
                    } else if(temp.getKey().equals("data-properties")) {
                        JsonArray properties = temp.getValue().getAsJsonArray();
                        JsonElement triple = properties.get(i);
                        JsonObject element = triple.getAsJsonObject();

                        Node domain = NodeFactory.createURI(element.get("domain").toString().replaceAll("\"","")+"_"+data.getId().split(":")[3]);
                        Node type_d = NodeFactory.createURI(element.get("property").toString());
                        Node range = NodeFactory.createURI(mappedOffStreetParkingDTO.getOrder(i));

                        Triple triples = new Triple(domain, type_d, range);
                        model.add(model.asStatement(triples));

//                        System.out.println("test"+mappedOffStreetParkingDTO.getOrder(i));
                    }
                }
            }
        }

        VirtModel vm = VirtModel.openDatabaseModel(graph_name, url, "dba", "dba");
        String drop_graph_query = "DROP SILENT GRAPH <" + graph_name +">";
        VirtuosoUpdateRequest virtuosoUpdateRequest = VirtuosoUpdateFactory.create(drop_graph_query, vm);
        virtuosoUpdateRequest.exec();
        System.out.println("drop graph");
        vm.add(model);
        System.out.println(""+model.size()+" triples created");
        vm.close();
    }
}
