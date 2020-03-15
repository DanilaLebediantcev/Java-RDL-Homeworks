import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        OrderStatus statusForOrder;
        List<Order> orders = new ArrayList<>();

        //Task 2 (через random определяем статус заказа и число заказов(countOfOrder),  выводим на экран заказы,
        //количество которых больше 50
        for (int i = 0; i < 100; i++) {
            switch (random.nextInt(3)) {
                case 1:
                    statusForOrder = OrderStatus.COMPLETED;
                    break;
                case 2:
                    statusForOrder = OrderStatus.NOT_STARTED;
                    break;
                default:
                    statusForOrder = OrderStatus.PROCESSING;
                    break;
            }
            orders.add(new Order(statusForOrder, 40 + random.nextInt(20), "Order number:" + i));
        }
        orders.stream().filter(order -> order.countOfOrders > 50).forEach(order -> System.out.println(order.name + ", order status " + order.status + " , priority: " + order.countOfOrders));


        //Task 4 Удаляем дубликаты
        //Способ 1, создать HashSet или LickedHashSet(если нужно сохранить порядок)
        Set<Order> ordersSet1 = new HashSet<>(orders);
        System.out.println();
        ordersSet1.forEach(order -> System.out.println(order.status + " " + order.countOfOrders));
        //Способ 2, воспользоваться методом distinct у стрима
        System.out.println();
        //Создаю новый список просто чтобы не менять исходный (может буду использовать в других заданиях)
        List<Order> orders2 = new ArrayList<>(orders);
        orders2.stream().distinct().forEach(order -> System.out.println(order.status + " " + order.countOfOrders));

        //Task 3
        System.out.println();
        System.out.println();
        Queue<Order> queue = new ConcurrentLinkedDeque<>(orders);
        MyThread<Order> thread1 = new MyThread<>(queue, 500, "thread1");
        MyThread<Order> thread2 = new MyThread<>(queue, 300, "thread2");
        MyThread<Order> thread3 = new MyThread<>(queue, 290, "thread3");

        thread1.start();
        thread2.start();
        thread3.start();


    }


    public enum OrderStatus {
        NOT_STARTED, PROCESSING, COMPLETED
    }

}

