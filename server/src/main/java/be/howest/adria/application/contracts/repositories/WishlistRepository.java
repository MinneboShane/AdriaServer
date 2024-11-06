package be.howest.adria.application.contracts.repositories;

import be.howest.adria.domain.Wishlist;

import java.util.Optional;
import java.util.UUID;

public interface WishlistRepository {
    Optional< Wishlist > findById( UUID wishlistId);
    void save(Wishlist wishlist);
    void delete(Wishlist wishlist);
}
