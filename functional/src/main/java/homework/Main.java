package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    static Random random = new Random();
    static OrderStatus statusForOrder;
    static List<Order> orders = new ArrayList<>();

    public static void main(String[] args) {
        //Task 2 (через random определяем статус заказа и сумму заказа(orderAmount),  выводим на экран заказы,
        //суммы которых больше 50
        for (int i = 0; i < 10; i++) {
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
            orders.add(new Order(statusForOrder, 40 + random.nextInt(20)));
        }

        Order.amount = 50;

        System.out.println("Все орерда:");
        orders.stream().forEach(x->System.out.println(x.getOrderStatus() + " " + x.getOrderAmount()));
        System.out.println();
        //Я надеюсь я правильно понял 2 задачу, мы должны сделать несколько оредров и отсоритировать их, используя
        //stream api. Раз у ордера есть поле orderAmount, то мы можем сразу написать уловие в фильтр как на примере ниже
        System.out.println("Вывод  ордеров, когда в фильтр пишем условие order.getOrderAmount() > someAmount");
        orders.stream().filter(x->x.getOrderAmount()>50).forEach(x->System.out.println(x.getOrderStatus() + " " + x.getOrderAmount()));


        System.out.println();
        //В условии задачи написано, что нужно реализовать boolean метод
        //стрим с Method References
        System.out.println("Вывод  ордеров, когда в фильтре используем boolean метод getOrdersWhoseAmountGreaterThenCertainNumber:");
        orders.stream().filter(Order::getOrdersWhoseAmountGreaterThenCertainNumber).forEach(x->System.out.println(x.getOrderStatus() + " " + x.getOrderAmount()));



        //Task3
        //В классе Order я сделал статичный метод createNewOrder, в который передаюэкземпляр интерфейса и статус, дергается дефолтный метод по созданию ордера
        OrderFactory orderFactory = new OrderFactory() {};
        System.out.println();
        System.out.println("Для сооздания оредров используем дефолтные методы (через статичный метод в классе Order)");
        System.out.println(Order.createNewOrder(orderFactory,OrderStatus.NOT_STARTED).getOrderStatus());
        System.out.println(Order.createNewOrder(orderFactory,OrderStatus.PROCESSING).getOrderStatus());
        System.out.println(Order.createNewOrder(orderFactory,OrderStatus.COMPLETED).getOrderStatus());

        //но как я понимаю статичный метод в Order не обязательный, поскольку можно просто через экземпляр интерфейса вызывать эти методы
        //в результате чего можно сделать вывод, что реализованный мной статичный метод в классе Order - лишняя реализация
        System.out.println("Для сооздания оредров используем дефолтные методы (через экземпляр интерфейса)");
        System.out.println(orderFactory.createOrderWithStatusNotStarted().getOrderStatus());
        System.out.println(orderFactory.createOrderWithStatusProcessing().getOrderStatus());
        System.out.println(orderFactory.createOrderWithStatusCompleted().getOrderStatus());
    }
}
