package Factory;

public class Truck implements ITransport {
    @Override
    public void answer() {
        System.out.println("answer: Belaz");
    }

    @Override
    public void deliver() {
        System.out.println("deliver: Russia");
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
