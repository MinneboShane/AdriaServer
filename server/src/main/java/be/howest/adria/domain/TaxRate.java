package be.howest.adria.domain;

import java.util.Objects;
import java.util.UUID;

public class TaxRate {
    private UUID taxRate;
    private String region;
    private double percentage;

    public TaxRate( UUID taxRateId, String region, double percentage ) {
        this.taxRate = taxRateId;
        this.region = region;
        this.percentage = percentage;
    }

    public UUID getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(UUID taxRate) {
        this.taxRate = taxRate;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion( String region ) {
        this.region = region;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage( double percentage ) {
        this.percentage = percentage;
    }

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        TaxRate taxRate = ( TaxRate ) o;
        return this.taxRate == taxRate.taxRate;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(taxRate);
    }

    @Override
    public String toString() {
        return "TaxRate{" +
                "takRateId=" + taxRate +
                ", Region='" + region + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}
