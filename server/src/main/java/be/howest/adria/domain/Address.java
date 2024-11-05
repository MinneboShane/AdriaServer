package be.howest.adria.domain;

import java.util.Objects;
import java.util.UUID;

public class Address {
    private UUID addressId;
    private UUID userId;
    private AddressType addresstype;
    private String street;
    private int number;
    private String extra; // busNr (e.g. a)
    private String city;
    private String zipcode;
    private String state;
    private String colony;

    public Address( UUID addressId, UUID userId, String colony, String state, String zipcode, String city, String extra, int number, String street, AddressType addresstype ) {
        this.addressId = addressId;
        this.userId = userId;
        this.colony = colony;
        this.state = state;
        this.zipcode = zipcode;
        this.city = city;
        this.extra = extra;
        this.number = number;
        this.street = street;
        this.addresstype = addresstype;
    }

    public UUID getAddressId() {
        return addressId;
    }

    public void setAddressId( UUID addressId ) {
        this.addressId = addressId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId( UUID userId ) {
        this.userId = userId;
    }

    public AddressType getAddresstype() {
        return addresstype;
    }

    public void setAddresstype( AddressType addresstype ) {
        this.addresstype = addresstype;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet( String street ) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber( int number ) {
        this.number = number;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra( String extra ) {
        this.extra = extra;
    }

    public String getCity() {
        return city;
    }

    public void setCity( String city ) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode( String zipcode ) {
        this.zipcode = zipcode;
    }

    public String getState() {
        return state;
    }

    public void setState( String state ) {
        this.state = state;
    }

    public String getColony() {
        return colony;
    }

    public void setColony( String colony ) {
        this.colony = colony;
    }

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Address address = ( Address ) o;
        return addressId == address.addressId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(addressId);
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", userId=" + userId +
                ", addressType=" + addresstype +
                ", street='" + street + '\'' +
                ", number=" + number +
                ", extra='" + extra + '\'' +
                ", city='" + city + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", state='" + state + '\'' +
                ", colony='" + colony + '\'' +
                '}';
    }
}
