package Factory;

public class Factory {
    public ITransport getCar(String car){
        ITransport transport = null;
        if(car.equals("PassengerCar")){
            transport = new PassengerCar();
        } else if(car.equals("Truck")){
            transport = new Truck();
        }
        return transport;
    }
}
