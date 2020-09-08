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
    private String priceRate;       //getPriceRate().getValue()
    private String priceCurrency;        //getPriceCurrency().getValue(0)
    private String image;       //getImage().getValue()
    private String locationType;        //getLocation().getValue().getType()
    private Location location;
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
    private String createdAt;       //getCreatedAt()
    private String modifiedAt;      //getModifiedAt()
    private OpeningHours openingHours;
    private String type;
    private PaymentAccepted paymentAccepted;
    private CongestionIndexPrediction congestionIndexPrediction;
//    private RefParkingSpots refParkingSpots;


    public class OpeningHours {
        private String type;
        private Object value;
    }

    private class Location {
        private String type;
        private LocationValue value;
        public class LocationValue {
            private String type;
            private Object coordinates;
        }
    }

    public class Name {
        private String type;
        private String value;
    }

    public class CongestionIndexPrediction {
        private String observedAt;
        private String type;
        private CongestionIndexPredictionValue value;
        public class CongestionIndexPredictionValue {
            private Object predictedAt;
            private Object index;
        }
    }

    public class PriceCurrency {
        private String type;
        private Object value;
    }

    public class LocationTag {
        private String type;
        private String value;
    }


    public class PaymentAccepted {
        private String type;
        private Object value;
    }

}
