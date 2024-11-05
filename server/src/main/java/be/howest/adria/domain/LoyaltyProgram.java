package be.howest.adria.domain;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class LoyaltyProgram {
    private UUID loyaltyProgramId;
    private UUID userId;
    private int pointsAccumulated;
    private Date lastUpdated;

    public LoyaltyProgram( UUID loyaltyProgramId, UUID userId, int pointsAccumulated, Date lastUpdated ) {
        this.loyaltyProgramId = loyaltyProgramId;
        this.userId = userId;
        this.pointsAccumulated = pointsAccumulated;
        this.lastUpdated = lastUpdated;
    }

    public UUID getLoyaltyProgramId() {
        return loyaltyProgramId;
    }

    public void setLoyaltyProgramId( UUID loyaltyProgramId ) {
        this.loyaltyProgramId = loyaltyProgramId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId( UUID userId ) {
        this.userId = userId;
    }

    public int getPointsAccumulated() {
        return pointsAccumulated;
    }

    public void setPointsAccumulated( int pointsAccumulated ) {
        this.pointsAccumulated = pointsAccumulated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated( Date lastUpdated ) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        LoyaltyProgram that = ( LoyaltyProgram ) o;
        return loyaltyProgramId == that.loyaltyProgramId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(loyaltyProgramId);
    }

    @Override
    public String toString() {
        return "LoyaltyProgram{" +
                "loyaltyProgramId=" + loyaltyProgramId +
                ", userId=" + userId +
                ", pointsAccumulated=" + pointsAccumulated +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
