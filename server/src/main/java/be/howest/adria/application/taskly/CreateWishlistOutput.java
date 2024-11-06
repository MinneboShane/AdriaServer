package be.howest.adria.application.taskly;

import java.util.UUID;

public class CreateWishlistOutput {
    public final UUID wishlistId;

    public CreateWishlistOutput(UUID wishlistId) {
        this.wishlistId = wishlistId;
    }
}
