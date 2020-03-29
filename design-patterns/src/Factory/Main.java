package Factory;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        IProduct product = new IProduct() {
            @Override
            public void getWeight() {
                System.out.println("putProduct getWeight: 1300");
            }

            @Override
            public void getSize() {
                    System.out.println("putProduct getSize: sedan");
            }
        };
        IProduct product2 = new IProduct() {
            @Override
            public void getWeight() {
                System.out.println("putProduct getWeight: 5300");
            }

            @Override
            public void getSize() {
                    System.out.println("putProduct getSize: truck");
            }
        };


        ITransport passengerCar = new Factory().getCar("PassengerCar");
        ITransport truck = new Factory().getCar("Truck");

        passengerCar.answer();
        passengerCar.deliver();
        passengerCar.putProduct(product);

        truck.answer();
        truck.deliver();
        truck.putProduct(product2);

    }
}
