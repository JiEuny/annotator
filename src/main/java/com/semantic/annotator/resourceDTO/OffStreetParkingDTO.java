package com.semantic.annotator.resourceDTO;

public class OffStreetParkingDTO {

    private String id;
    private String name;        //getName().getValue()
    private String locationTag;     //getLocationTag().getValue()
    private String category0;      //getCategory().getValue(0)
    private String category1;      //getCategory().getValue(1)
    private Number totalSpotNumber;     //getTotalSpotNumber().getValue()
    private Number availableSpotNumber;     //getAvailableSpotNumber().getValue()
    private String status0;      //getStatus().getValue(0)
    private String status1;      //getStatus().getValue(1)
    private String telephone;       //getContactPoint().getValue().getTelephone()
    private String email;       //getContactPoint().getValue().getEmail()
    private String contactType;     //getContactPoint().getValue().getContactType()
    private String paymentType0;    //getPaymentAccepted().getValue(0)
    private String paymentType1;    //getPaymentAccepted().getValue(1)
    private String priceRate;       //getPriceRate().getValue()
    private String priceCurrency;        //getPriceCurrency().getValue(0)
    private String image;       //getImage().getValue()
    private String locationType1_1;      //getLocation().getValue().getType()
    private String latitute1_1;     //getLocation().getValue().getCoordinates(0).toString().replace('[', ' ').replace(']', ' ').split(" |,")[5]
    private String longitude1_1;    //getLocation().getValue().getCoordinates(0).toString().replace('[', ' ').replace(']', ' ').split(" |,")[3]
    private String locationType1_2;      //getLocation().getValue().getType()
    private String latitute1_2;     //getLocation().getValue().getCoordinates(0).toString().replace('[', ' ').replace(']', ' ').split(" |,")[11]
    private String longitude1_2;    //getLocation().getValue().getCoordinates(0).toString().replace('[', ' ').replace(']', ' ').split(" |,")[9]
    private String locationType1_3;      //getLocation().getValue().getType()
    private String latitute1_3;     //getLocation().getValue().getCoordinates(0).toString().replace('[', ' ').replace(']', ' ').split(" |,")[17]
    private String longitude1_3;    //getLocation().getValue().getCoordinates(0).toString().replace('[', ' ').replace(']', ' ').split(" |,")[15]
    private String locationType1_4;      //getLocation().getValue().getType()
    private String latitute1_4;     //getLocation().getValue().getCoordinates(0).toString().replace('[', ' ').replace(']', ' ').split(" |,")[23]
    private String longitude1_4;    //getLocation().getValue().getCoordinates(0).toString().replace('[', ' ').replace(']', ' ').split(" |,")[21]
    private String locationType1_5;      //getLocation().getValue().getType()
    private String latitute1_5;     //getLocation().getValue().getCoordinates(0).toString().replace('[', ' ').replace(']', ' ').split(" |,")[29]
    private String longitude1_5;    //getLocation().getValue().getCoordinates(0).toString().replace('[', ' ').replace(']', ' ').split(" |,")[27]
    private String locationType2_1;      //getLocation().getValue().getType()
    private String latitute2_1;     //getLocation().getValue().getCoordinates(0).toString().replace('[', ' ').replace(']', ' ').split(" |,")[37]
    private String longitude2_1;    //getLocation().getValue().getCoordinates(0).toString().replace('[', ' ').replace(']', ' ').split(" |,")[35]
    private String locationType2_2;      //getLocation().getValue().getType()
    private String latitute2_2;     //getLocation().getValue().getCoordinates(0).toString().replace('[', ' ').replace(']', ' ').split(" |,")[43]
    private String longitude2_2;    //getLocation().getValue().getCoordinates(0).toString().replace('[', ' ').replace(']', ' ').split(" |,")[41]
    private String locationType2_3;      //getLocation().getValue().getType()
    private String latitute2_3;     //getLocation().getValue().getCoordinates(0).toString().replace('[', ' ').replace(']', ' ').split(" |,")[49]
    private String longitude2_3;    //getLocation().getValue().getCoordinates(0).toString().replace('[', ' ').replace(']', ' ').split(" |,")[47]
    private String locationType2_4;      //getLocation().getValue().getType()
    private String latitute2_4;     //getLocation().getValue().getCoordinates(0).toString().replace('[', ' ').replace(']', ' ').split(" |,")[55]
    private String longitude2_4;    //getLocation().getValue().getCoordinates(0).toString().replace('[', ' ').replace(']', ' ').split(" |,")[53]
    private String locationType2_5;      //getLocation().getValue().getType()
    private String latitute2_5;     //getLocation().getValue().getCoordinates(0).toString().replace('[', ' ').replace(']', ' ').split(" |,")[61]
    private String longitude2_5;    //getLocation().getValue().getCoordinates(0).toString().replace('[', ' ').replace(']', ' ').split(" |,")[59]
    private String locationName1 = "addressCountry";
    private String addressCountry;      //getAddress().getValue().getAddressCountry()
    private String locationName2 = "addressRegion";
    private String addressRegion;       //getAddress().getValue().getAddressRegion()
    private String locationName3 = "addressLocality";
    private String addressLocality;     //getAddress().getValue().getAddressLocality()
    private String locationName4 = "streetAddress";
    private String streetAddress;       //getAddress().getValue().getStreetAddress()
    private String locationName5 = "addressTown";
    private String addressTown;     //getAddress().getValue().getAddressTown()
    private String createdAt;       //offStreetParkingList.get(0).getCreatedAt().split(",")[0]+"+09:00"
    private String modifiedAt;      //getModifiedAt().split(",")[0]+"+09:00"
    private String openingHours = "1111-11-11T00:00:00";
    private String endingHours = "1111-11-11T23:59:59";
    private String openingType = "OpeningHours";
    private String endingType = "OpeningHours";
    private String estimatedValue;    //getCongestionIndexPrediction().getValue().getIndex().toString()
    private String predictedAt;     //getCongestionIndexPrediction().getValue().getPredictedAt(0).toString().split(",")[0]+"+09:00"

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocationTag(String locationTag) {
        this.locationTag = locationTag;
    }
}
