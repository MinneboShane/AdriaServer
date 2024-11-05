package be.howest.adria.domain;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class shoppingCart {
    private UUID shoppingCartId;
    private UUID orderId;
    private Date dateCreated;

    List<Product> productsInCart;


    public shoppingCart( UUID shoppingCartId, UUID orderId, Date dateCreated ) {
        this.shoppingCartId = shoppingCartId;
        this.orderId = orderId;
        this.dateCreated = dateCreated;
    }

    public UUID getShoppingCartId() {
        return shoppingCartId;
    }

    public void setShoppingCartId( UUID shoppingCartId ) {
        this.shoppingCartId = shoppingCartId;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId( UUID orderId ) {
        this.orderId = orderId;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated( Date dateCreated ) {
        this.dateCreated = dateCreated;
    }

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        shoppingCart that = ( shoppingCart ) o;
        return shoppingCartId == that.shoppingCartId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(shoppingCartId);
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "shoppingCartId=" + shoppingCartId +
                ", orderId=" + orderId +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
