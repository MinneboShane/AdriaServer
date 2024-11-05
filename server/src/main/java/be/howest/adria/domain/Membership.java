package be.howest.adria.domain;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Membership {
    private UUID membershipId;
    private UUID userId;
    private MembershipType membershipType;
    private Date startDate;
    private Date renewalDate;
    private StatusType status;

    public Membership( UUID membershipId, UUID userId, MembershipType membershipType, Date startDate, Date renewalDate, StatusType status ) {
        this.membershipId = membershipId;
        this.userId = userId;
        this.membershipType = membershipType;
        this.startDate = startDate;
        this.renewalDate = renewalDate;
        this.status = status;
    }

    public UUID getMembershipId() {
        return membershipId;
    }

    public void setMembershipId( UUID membershipId ) {
        this.membershipId = membershipId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId( UUID userId ) {
        this.userId = userId;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public void setMembershipType( MembershipType membershipType ) {
        this.membershipType = membershipType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate( Date startDate ) {
        this.startDate = startDate;
    }

    public Date getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate( Date renewalDate ) {
        this.renewalDate = renewalDate;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus( StatusType status ) {
        this.status = status;
    }

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Membership that = ( Membership ) o;
        return membershipId == that.membershipId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(membershipId);
    }

    @Override
    public String toString() {
        return "Membership{" +
                "membershipId=" + membershipId +
                ", userId=" + userId +
                ", membershipType=" + membershipType +
                ", startDate=" + startDate +
                ", renewalDate=" + renewalDate +
                ", status=" + status +
                '}';
    }
}
