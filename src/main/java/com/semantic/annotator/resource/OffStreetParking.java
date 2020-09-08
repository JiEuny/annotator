package com.semantic.annotator.resource;

import java.lang.reflect.Array;
import java.util.List;

public class OffStreetParking {

    private String id;
    private Name name;
    private LocationTag locationTag;
    private Category category;
    private TotalSpotNumber totalSpotNumber;
    private AvailableSpotNumber availableSpotNumber;
    private Status status;
    private ContactPoint contactPoint;
    private PaymentAccepted paymentAccepted;
    private PriceRate priceRate;
    private PriceCurrency priceCurrency;
    private Image image;
    private Location location;
    private Address address;
    private String createdAt;
    private String modifiedAt;
    private OpeningHours openingHours;
    private CongestionIndexPrediction congestionIndexPrediction;

    private String type;
    //    private String parkingLotURI;
    //    private Object maximumAllowedHeight;
    private RefParkingSpots refParkingSpots;
//    private String observedAt;
//    private List<String> context;


    public String getModifiedAt() {
        return modifiedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Status getStatus() {
        return status;
    }

    public Location getLocation() {
        return location;
    }

    public class Location {
        private String type;
        private LocationValue value;
        public class LocationValue {
            private String type;
            private Object[] coordinates;

            public String getType() {
                return type;
            }

            public Object getCoordinates(int i) {
                return coordinates[i];
            }
        }
        public LocationValue getValue() {
            return value;
        }

    }

    public String getType() {
        return type;
    }
    public class Status {
        private String type;
        private Object[] value;
        public Object getValue(int i) {
            return value[i];
        }

    }
    public class TotalSpotNumber {
        private String type;

        private Number value;
        public Number getValue() {
            return value;
        }

    }

    public TotalSpotNumber getTotalSpotNumber() {
        return totalSpotNumber;
    }
    public class Category {
        private String type;

        private Object[] value;
        public Object getValue(int i) {
            return value[i];
        }

    }

    public Category getCategory() {
        return category;
    }
    public class RefParkingSpots {
        private String type;
        private Object value;

    }
    public class OpeningHours {
        private String type;
        private Object value;

        public Object getValue() {
            return value;
        }
    }

    public OpeningHours getOpeningHours() {
        return openingHours;
    }

    public class Name {
        private String type;
        private String value;

        public String getValue() {
            return value;
        }
    }

    public Name getName() {
        return name;
    }

    public class CongestionIndexPrediction {
        private String observedAt;
        private String type;
        private CongestionIndexPredictionValue value;
        public class CongestionIndexPredictionValue {
            private Object[] predictedAt;
            private Object index;

            public Object getPredictedAt(int i) {
                return predictedAt[i];
            }

            public Object getIndex() {
                return index;
            }
        }

        public CongestionIndexPredictionValue getValue() {
            return value;
        }
    }

    public CongestionIndexPrediction getCongestionIndexPrediction() {
        return congestionIndexPrediction;
    }

    public class AvailableSpotNumber {
        private String type;
        private Number value;

        public Number getValue() {
            return value;
        }
    }

    public AvailableSpotNumber getAvailableSpotNumber() {
        return availableSpotNumber;
    }

    public class PriceCurrency {
        private String type;
        private Object[] value;

        public Object getValue(int i) {
            return value[i];
        }

    }

    public class PaymentAccepted {
        private String type;
        private Object[] value;

        public Object getValue(int i) {
            return value[i];
        }
    }

    public PaymentAccepted getPaymentAccepted() {
        return paymentAccepted;
    }

    public PriceCurrency getPriceCurrency() {
        return priceCurrency;
    }
    public class LocationTag {
        private String type;

        private String value;
        public String getValue() {
            return value;
        }

    }

    public LocationTag getLocationTag() {
        return locationTag;
    }
    public class ContactPoint {
        private String type;
        private ContactPointValue value;
        public class ContactPointValue {
            private String telephone;
            private String contactType;

            private String email;

            public String getTelephone() {
                return telephone;
            }

            public String getContactType() {
                return contactType;
            }
            public String getEmail() {
                return email;
            }

        }
        public ContactPointValue getValue() {
            return value;
        }

    }

    public ContactPoint getContactPoint() {
        return contactPoint;
    }
    public class Address {
        private String type;
        private AddressValue value;
        public class AddressValue {
            private String addressCountry;
            private String addressRegion;
            private String addressLocality;
            private String streetAddress;

            private String addressTown;

            public String getAddressCountry() {
                return addressCountry;
            }

            public String getAddressRegion() {
                return addressRegion;
            }

            public String getAddressLocality() {
                return addressLocality;
            }

            public String getStreetAddress() {
                return streetAddress;
            }
            public String getAddressTown() {
                return addressTown;
            }

        }
        public AddressValue getValue() {
            return value;
        }

    }

    public Address getAddress() {
        return address;
    }
    public class PriceRate {
        private String type;

        private String value;
        public String getValue() {
            return value;
        }

    }

    public PriceRate getPriceRate() {
        return priceRate;
    }
    public class Image {
        private String type;

        private String value;
        public String getValue() {
            return value;
        }

    }

    public Image getImage() {
        return image;
    }

    public String getId() {
        return id;
    }

    public Object getRefParkingSpots() {
        return refParkingSpots;
    }

}