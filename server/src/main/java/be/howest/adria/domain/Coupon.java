package be.howest.adria.domain;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Coupon {
    private UUID couponId;
    private String code;
    private double discountAmount;
    private double minimumPurchaseAmount;
    private Date expirationDate;

    public Coupon( UUID couponId, String code, double discountAmount, double minimumPurchaseAmount, Date expirationDate ) {
        this.couponId = couponId;
        this.code = code;
        this.discountAmount = discountAmount;
        this.minimumPurchaseAmount = minimumPurchaseAmount;
        this.expirationDate = expirationDate;
    }

    public UUID getCouponId() {
        return couponId;
    }

    public void setCouponId( UUID couponId ) {
        this.couponId = couponId;
    }

    public String getCode() {
        return code;
    }

    public void setCode( String code ) {
        this.code = code;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount( double discountAmount ) {
        this.discountAmount = discountAmount;
    }

    public double getMinimumPurchaseAmount() {
        return minimumPurchaseAmount;
    }

    public void setMinimumPurchaseAmount( double minimumPurchaseAmount ) {
        this.minimumPurchaseAmount = minimumPurchaseAmount;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate( Date expirationDate ) {
        this.expirationDate = expirationDate;
    }

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Coupon coupon = ( Coupon ) o;
        return couponId == coupon.couponId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(couponId);
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "couponId=" + couponId +
                ", code='" + code + '\'' +
                ", discountAmount=" + discountAmount +
                ", minimumPurchaseAmount=" + minimumPurchaseAmount +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
