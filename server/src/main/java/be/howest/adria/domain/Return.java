package be.howest.adria.domain;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Return {
    private UUID returnId;
    private UUID productId;
    private UUID orderId;
    private Date returnDate;
    private double returnPrice;
    private String reason;

    public Return( UUID returnId, UUID productId, UUID orderId, Date returnDate, double returnPrice, String reason ) {
        this.returnId = returnId;
        this.productId = productId;
        this.orderId = orderId;
        this.returnDate = returnDate;
        this.returnPrice = returnPrice;
        this.reason = reason;
    }

    public UUID getReturnId() {
        return returnId;
    }

    public void setReturnId( UUID returnId ) {
        this.returnId = returnId;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId( UUID productId ) {
        this.productId = productId;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId( UUID orderId ) {
        this.orderId = orderId;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate( Date returnDate ) {
        this.returnDate = returnDate;
    }

    public double getReturnPrice() {
        return returnPrice;
    }

    public void setReturnPrice( double returnPrice ) {
        this.returnPrice = returnPrice;
    }

    public String getReason() {
        return reason;
    }

    public void setReason( String reason ) {
        this.reason = reason;
    }

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Return aReturn = ( Return ) o;
        return returnId == aReturn.returnId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(returnId);
    }

    @Override
    public String toString() {
        return "Return{" +
                "returnId=" + returnId +
                ", productId=" + productId +
                ", orderId=" + orderId +
                ", returnDate=" + returnDate +
                ", returnPrice=" + returnPrice +
                ", reason='" + reason + '\'' +
                '}';
    }
}
