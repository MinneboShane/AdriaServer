package be.howest.adria.domain;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Order {
    private UUID orderId;
    private Date orderDate;
    private Address orderAddress;
    private double orderAmount;
    private DeliveryType deliveryType;
    private PaymentType paymentType;
    private double orderWeight;
    private OrderStatus orderStatus;

    public Order( UUID orderId, Date orderDate, Address orderAddress, double orderAmount, DeliveryType deliveryType, double orderWeight, PaymentType paymentType, OrderStatus orderStatus ) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderAddress = orderAddress;
        this.orderAmount = orderAmount;
        this.deliveryType = deliveryType;
        this.orderWeight = orderWeight;
        this.paymentType = paymentType;
        this.orderStatus = orderStatus;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId( UUID orderId ) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate( Date orderDate ) {
        this.orderDate = orderDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount( double orderAmount ) {
        this.orderAmount = orderAmount;
    }

    public Address getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress( Address orderAddress ) {
        this.orderAddress = orderAddress;
    }

    public DeliveryType getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType( DeliveryType deliveryType ) {
        this.deliveryType = deliveryType;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType( PaymentType paymentType ) {
        this.paymentType = paymentType;
    }

    public double getOrderWeight() {
        return orderWeight;
    }

    public void setOrderWeight( double orderWeight ) {
        this.orderWeight = orderWeight;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus( OrderStatus orderStatus ) {
        this.orderStatus = orderStatus;
    }

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Order order = ( Order ) o;
        return orderId == order.orderId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(orderId);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderDate=" + orderDate +
                ", orderAddress=" + orderAddress +
                ", orderAmount=" + orderAmount +
                ", deliveryType=" + deliveryType +
                ", paymentType=" + paymentType +
                ", orderWeight=" + orderWeight +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
