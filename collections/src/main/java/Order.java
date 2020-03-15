import java.util.Objects;

public class Order {
    public final Main.OrderStatus status;
    public final int countOfOrders;
    public final String name;

    public Order(Main.OrderStatus status, int countOfOrders, String name) {
        this.status = status;
        this.countOfOrders = countOfOrders;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return countOfOrders == order.countOfOrders &&
                status == order.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, countOfOrders);
    }

    public Main.OrderStatus getStatus() {
        return status;
    }
}
