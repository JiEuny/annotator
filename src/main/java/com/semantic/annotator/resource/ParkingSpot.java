package com.semantic.annotator.resource;

import java.util.Arrays;
import java.util.List;

public class ParkingSpot {

    private String id;
    private String type;
    private String createdAt;
    private String modifiedAt;
    private Name name;
    private Location location;
    private Address address;
    private Category category;
    private Width width;
    private Length length;
    private Status status;
    private RefParkingLot refParkingLot;

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getModifiedAt() {
        return modifiedAt;
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

    private class Location {
        private String type;
        private LocationValue value;
        public class LocationValue {
            private String type;
            //CHECK Latitute, Longitute
            private Object coordinates;

            public String getType() {
                return type;
            }

            public Object getCoordinates() {
                return coordinates;
            }
        }

        public LocationValue getValue() {
            return value;
        }
    }

    public Location getLocation() {
        return location;
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

        public AddressValue getValue() { return value; }
    }

    public Address getAddress() {
        return address;
    }

    //- CHECK
    public String getAddressCountry() {
        return address.value.addressCountry;
    }

    public String getAddressRegion() {
        return address.value.addressRegion;
    }

    public String getAddressLocality() {
        return address.value.addressLocality;
    }

    public String getStreetAddress() {
        return address.value.streetAddress;
    }

    public String getAddressTown() {
        return address.value.addressTown;
    }
    //-- CHECK

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

    public class Width {
        private String type;
        private Number value;

        public String getType() {
            return type;
        }

        public Number getValue() {
            return value;
        }
    }

    public Width getWidth() {
        return width;
    }

    public class Length {
        private String type;
        private Number value;

        public String getType() {
            return type;
        }

        public Number getValue() {
            return value;
        }
    }

    public Length getLength() {
        return length;
    }

    private class Status {
        private String type;
        private String value;
        private String observedAt;

        public String getType() {
            return type;
        }

        public String getValue() {
            return value;
        }

        public String getObservedAt() {
            return observedAt;
        }
    }

    public Status getStatus(){ return status; }

    public class RefParkingLot {
        private String type;
        private String value;

        public String getType() {
            return type;
        }

        public String getValue() {
            return value;
        }
    }

    public RefParkingLot getRefParkingLot() {
        return refParkingLot;
    }
}

