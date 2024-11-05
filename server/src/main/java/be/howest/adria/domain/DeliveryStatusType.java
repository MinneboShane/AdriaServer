package be.howest.adria.domain;

public enum DeliveryStatusType {
    IN_TRANSIT, // package is on its way to delivery services
    OUT_FOR_DELIVERY, // package is with delivery service and is scheduled to be delivered that day
    DELIVERED, // package has been delivered successfully
    FAILED, // package could not be delivered due to recipient not being home/pickup place was closed
    RETURNED // package could not be delivered and is being sent back to the seller.

}
