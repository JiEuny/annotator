package com.semantic.annotator.resource;

public class Address {
    private String type;
    private AddressValue value;

    public class AddressValue {
        private String addressCountry;
        private String addressRegion;
        private String addressLocality;
        private String streetAddress;
        private String addressTown;

        public String getCountry() {
            return addressCountry;
        }

        public String getRegion() {
            return addressRegion;
        }

        public String getLocality() {
            return addressLocality;
        }

        public String getStreet() {
            return streetAddress;
        }

        public String getTown() {
            return addressTown;
        }
    }

    public String getType()  {
        return type;

    }

    public AddressValue getValue() {
        return value;
    }

    public String getAddressCountry(){
        return value.addressCountry;
    }

    public String getAddressRegion() {
        return value.addressRegion;
    }

    public String getAddressLocality() {
        return value.addressLocality;
    }

    public String getStreetAddress() {
        return value.streetAddress;
    }

    public String getAddressTown() {
        return value.addressTown;
    }
}
