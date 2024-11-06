package be.howest.adria.domain;

import java.util.Objects;
import java.util.UUID;

public class Wishlist {
    private UUID wishlistId;
    private UUID userId;
    private String name;

    public static Wishlist create(UUID userId, String name) {
        return new Wishlist(UUID.randomUUID(), userId, name);
    }

    public static Wishlist create(UUID wishlistId, UUID userId, String name) {
        return new Wishlist(wishlistId, userId, name);
    }

    public Wishlist( UUID wishlistId, UUID userId, String name ) {
        this.wishlistId = wishlistId;
        this.userId = userId;
        this.name = name;
    }

    public UUID getWishlistId() {
        return wishlistId;
    }

    public void setWishlistId( UUID wishlistId ) {
        this.wishlistId = wishlistId;
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
}
