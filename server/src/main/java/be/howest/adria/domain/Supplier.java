package be.howest.adria.domain;

import java.util.Objects;
import java.util.UUID;

public class Supplier {
    private UUID supplierId;
    private String name;
    private String contactName;
    private String phoneNumber;
    private String email;
    private Address address;

    public Supplier( UUID supplierId, String name, String contactName, String phoneNumber, String email, Address address ) {
        this.supplierId = supplierId;
        this.name = name;
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public UUID getSupplierId() {
        return supplierId;
    }

    public void setSupplierId( UUID supplierId ) {
        this.supplierId = supplierId;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName( String contactName ) {
        this.contactName = contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber( String phoneNumber ) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress( Address address ) {
        this.address = address;
    }

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Supplier supplier = ( Supplier ) o;
        return supplierId == supplier.supplierId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(supplierId);
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId=" + supplierId +
                ", name='" + name + '\'' +
                ", contactName='" + contactName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }
}