package be.howest.adria.domain;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Shipment {
    private UUID shipmentId;
    private UUID orderId;
    private UUID droneId;
    private Date shipmentDate;
    private Date estimatedDeliveryDate;
    private String trackingNumber;
    private DeliveryStatusType deliveryStatusType;

    public Shipment( UUID shipmentId, UUID orderId, UUID droneId, Date shipmentDate, Date estimatedDeliveryDate, String trackingNumber, DeliveryStatusType deliveryStatusType ) {
        this.shipmentId = shipmentId;
        this.orderId = orderId;
        this.droneId = droneId;
        this.shipmentDate = shipmentDate;
        this.estimatedDeliveryDate = estimatedDeliveryDate;
        this.trackingNumber = trackingNumber;
        this.deliveryStatusType = deliveryStatusType;
    }

    public UUID getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId( UUID shipmentId ) {
        this.shipmentId = shipmentId;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId( UUID orderId ) {
        this.orderId = orderId;
    }

    public UUID getDroneId() {
        return droneId;
    }

    public void setDroneId( UUID droneId ) {
        this.droneId = droneId;
    }

    public Date getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate( Date shipmentDate ) {
        this.shipmentDate = shipmentDate;
    }

    public Date getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate( Date estimatedDeliveryDate ) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber( String trackingNumber ) {
        this.trackingNumber = trackingNumber;
    }

    public DeliveryStatusType getDeliveryStatusType() {
        return deliveryStatusType;
    }

    public void setDeliveryStatusType( DeliveryStatusType deliveryStatusType ) {
        this.deliveryStatusType = deliveryStatusType;
    }

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Shipment shipment = ( Shipment ) o;
        return shipmentId == shipment.shipmentId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(shipmentId);
    }

    @Override
    public String toString() {
        return "Shipment{" +
                "shipmentId=" + shipmentId +
                ", orderId=" + orderId +
                ", droneId=" + droneId +
                ", shipmentDate=" + shipmentDate +
                ", estimatedDeliveryDate=" + estimatedDeliveryDate +
                ", trackingNumber='" + trackingNumber + '\'' +
                ", deliveryStatusType=" + deliveryStatusType +
                '}';
    }
}
