package be.howest.adria.domain;

public enum OrderStatus {
    PENDING, // order has been received but not yet processed
    PROCESSING, // order is being prepared for shipment
    COMPLETED, // order has been successfully processed
    CANCELLED, // order has been cancelled by the customer or the seller
    REFUNDED // order has been returned and the customer is being refunded
}


