package State;

public class Start implements ICoffeeMachine {
    int coffeeCost = 50;
    int deposit;

    public Start(int deposit) {
        this.deposit = deposit;
    }

    @Override
    public void Deposit(int deposit) {
        System.out.println("Вы внесли " + deposit + " рублей");
    }

    @Override
    public void PrepareCoffee() {

    }

    @Override
    public void DeliverCoffee() {

    }

    @Override
    public void GiveChange(int deposit) {
        if (deposit > coffeeCost) {
            System.out.println("Кофе стоит " + coffeeCost + " р. Заберите вашу сдачу: " + (deposit - coffeeCost));
        }

    }

    @Override
    public void dispatchError() {
        if (deposit < coffeeCost) {
            System.out.println("Внесенный депозит меньше стоимости одного кофе (50р)");
        }

    }

    @Override
    public void init() {
        System.out.println("-------------------------------");
        Deposit(deposit);
        GiveChange(deposit);
        dispatchError();
    }

    @Override
    public void stop() {

    }
}
