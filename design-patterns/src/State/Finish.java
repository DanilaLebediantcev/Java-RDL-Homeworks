package State;

import org.w3c.dom.ls.LSOutput;

public class Finish implements ICoffeeMachine {
    @Override
    public void Deposit(int MoneyAmount) {

    }

    @Override
    public void PrepareCoffee() {

    }

    @Override
    public void DeliverCoffee() {
        System.out.println("Ваш кофе готов, можете забрать его. Осторожно, не обожгитесь!");
    }

    @Override
    public void GiveChange(int MoneyAmount) {
    }

    @Override
    public void dispatchError() {

    }

    @Override
    public void init() {
        System.out.println("-------------------------------");
        DeliverCoffee();
        stop();
    }

    @Override
    public void stop() {
        System.out.println("Приятного кофепития!");
    }
}
