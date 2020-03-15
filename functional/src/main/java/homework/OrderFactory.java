package homework;

public interface OrderFactory {
    default Order createOrderWithStatusNotStarted(){
        return new Order(OrderStatus.NOT_STARTED);
    }

    default Order createOrderWithStatusProcessing(){
        return new Order(OrderStatus.PROCESSING);
    }

    default Order createOrderWithStatusCompleted(){
        return new Order(OrderStatus.COMPLETED);
    }
}
