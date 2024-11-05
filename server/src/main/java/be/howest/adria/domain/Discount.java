package be.howest.adria.domain;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Discount {
    private UUID discountId;
    private String code;
    private String description;
    private double percentage;
    private Date startDate;
    private Date endDate;

    public Discount( UUID discountId, String code, String description, double percentage, Date startDate, Date endDate ) {
        this.discountId = discountId;
        this.code = code;
        this.description = description;
        this.percentage = percentage;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public UUID getDiscountId() {
        return discountId;
    }

    public void setDiscountId( UUID discountId ) {
        this.discountId = discountId;
    }

    public String getCode() {
        return code;
    }

    public void setCode( String code ) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription( String description ) {
        this.description = description;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage( double percentage ) {
        this.percentage = percentage;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate( Date startDate ) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate( Date endDate ) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Discount discount = ( Discount ) o;
        return discountId == discount.discountId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(discountId);
    }

    @Override
    public String toString() {
        return "Discount{" +
                "discountId=" + discountId +
                ", code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", percentage=" + percentage +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
