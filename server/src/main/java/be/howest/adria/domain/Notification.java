package be.howest.adria.domain;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Notification {
    private UUID notificationId;
    private UUID userId;
    private String message;
    private Date dateSent;

    public Notification( UUID notificationId, UUID userId, String message, Date dateSent ) {
        this.notificationId = notificationId;
        this.userId = userId;
        this.message = message;
        this.dateSent = dateSent;
    }

    public UUID getNotificationId() {
        return notificationId;
    }

    public void setNotificationId( UUID notificationId ) {
        this.notificationId = notificationId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId( UUID userId ) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage( String message ) {
        this.message = message;
    }

    public Date getDateSent() {
        return dateSent;
    }

    public void setDateSent( Date dateSent ) {
        this.dateSent = dateSent;
    }

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Notification that = ( Notification ) o;
        return notificationId == that.notificationId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(notificationId);
    }

    @Override
    public String toString() {
        return "Notification{" +
                "notificationId=" + notificationId +
                ", userId=" + userId +
                ", message='" + message + '\'' +
                ", dateSent=" + dateSent +
                '}';
    }
}
