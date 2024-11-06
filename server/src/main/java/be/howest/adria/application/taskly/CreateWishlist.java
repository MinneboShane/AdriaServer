package be.howest.adria.application.taskly;

import be.howest.adria.application.contracts.repositories.UserRepository;
import be.howest.adria.application.contracts.repositories.WishlistRepository;
import be.howest.adria.application.contracts.usecases.OutputPort;
import be.howest.adria.application.contracts.usecases.UseCase;
import be.howest.adria.domain.Wishlist;

public class CreateWishlist implements UseCase<CreateWishlistInput> {
    private final WishlistRepository WishlistRepository;
    private final OutputPort<CreateWishlistOutput> outputPort;

    public CreateWishlist( WishlistRepository wishlistRepository, OutputPort<CreateWishlistOutput> outputPort ) {
        this.WishlistRepository = wishlistRepository;
        this.outputPort = outputPort;
    }

    @Override
    public void execute( CreateWishlistInput input ) {
        Wishlist wishlist = Wishlist.create(input.userId, input.name);
        WishlistRepository.save(wishlist);
        outputPort.present(new CreateWishlistOutput(wishlist.getWishlistId()));
    }
}
