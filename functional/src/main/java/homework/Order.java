package homework;

import java.util.Objects;

public class Order {
    private OrderStatus orderStatus;
    private int orderAmount;
    public static int amount;

    public Order(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Order(OrderStatus orderStatus, int orderAmount) {
        this.orderStatus = orderStatus;
        this.orderAmount = orderAmount;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderAmount == order.orderAmount &&
                orderStatus == order.orderStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderStatus, orderAmount);
    }

    public boolean getOrdersWhoseAmountGreaterThenCertainNumber() {
        return orderAmount > amount;
    }

    public static Order createNewOrder(OrderFactory orderFactory,OrderStatus statusForOrderFactoryMethods){
        switch (statusForOrderFactoryMethods){
            case COMPLETED:
                return orderFactory.createOrderWithStatusCompleted();
            case PROCESSING:
                return orderFactory.createOrderWithStatusProcessing();
            default:
                return orderFactory.createOrderWithStatusNotStarted();
        }
    }
}

enum OrderStatus {
    NOT_STARTED, PROCESSING, COMPLETED;
}