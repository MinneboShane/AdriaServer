package be.howest.adria.application.taskly;

import java.util.UUID;

public class CreateWishlistInput {
    public final UUID userId;
    public final String name;

    public CreateWishlistInput(UUID userId, String name) {
        this.userId = userId;
        this.name = name;
    }
}
