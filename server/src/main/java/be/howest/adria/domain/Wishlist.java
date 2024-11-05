package be.howest.adria.domain;

import java.util.Objects;
import java.util.UUID;

public class Wishlist {
    private UUID wishlistID;
    private UUID userId;
    private String name;

    public Wishlist( UUID id, UUID userId, String name ) {
        this.wishlistID = id;
        this.userId = userId;
        this.name = name;
    }

    public UUID getWishlistID() {
        return wishlistID;
    }

    public void setWishlistID( UUID wishlistID ) {
        this.wishlistID = wishlistID;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId( UUID userId ) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Wishlist wishlist = ( Wishlist ) o;
        return wishlistID == wishlist.wishlistID;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(wishlistID);
    }

    @Override
    public String toString() {
        return "Wishlist{" +
                "id=" + wishlistID +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                '}';
    }
}
