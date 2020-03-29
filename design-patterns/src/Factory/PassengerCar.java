package Factory;

public class PassengerCar implements ITransport {
    @Override
    public void answer() {
        System.out.println("answer: Audi");
    }

    @Override
    public void deliver() {
        System.out.println("deliver: Germany");
    }

    @Override
    public void putProduct(IProduct product) {
        product.getSize();
        product.getWeight();
    }

    @Override
    public IProduct getProduct() {
        return null;
    }

}
