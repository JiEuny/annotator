package com.semantic.annotator.resourceDTO;

import com.semantic.annotator.resource.ParkingSpot;

public class ParkingSpotDTO {
    private String id;
    private String name;
    private String createdat;
    private String modifiedat;

    private String locationType;
    private Number locationLatitute;
    private Number locationLongitude;

    private String addressName1 = "addressCountry";
    private String addressCountry;      //getAddress().getValue().getAddressCountry()
    private String addressName2 = "addressRegion";
    private String addressRegion;       //getAddress().getValue().getAddressRegion()
    private String addressName3 = "addressLocality";
    private String addressLocality;     //getAddress().getValue().getAddressLocality()
    private String addressName4 = "streetAddress";
    private String streetAddress;       //getAddress().getValue().getStreetAddress()
    private String addressName5 = "addressTown";
    private String addressTown;     //getAddress().getValue().getAddressTown()

    private String category;
    private String refParkingLot;
    private String status;
    private Number width;
    private Number length;
}
