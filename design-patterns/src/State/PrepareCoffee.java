package State;

import org.w3c.dom.ls.LSOutput;

public class PrepareCoffee implements ICoffeeMachine {
    @Override
    public void Deposit(int MoneyAmount) {

    }

    @Override
    public void PrepareCoffee() {
        System.out.println("Ваш кофе готовится, пожалуйста подождите");
    }

    @Override
    public void DeliverCoffee() {

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
        PrepareCoffee();

    }

    @Override
    public void stop() {

    }
}
