package State;

public class CoffeeMachine {
    public static void main(String[] args) {
        ICoffeeMachine coffeeMachine = new Start(70);
        WorkProcess workProcess = new WorkProcess();

        workProcess.setState(coffeeMachine);
        for (int i = 0; i < 3; i++) {
            workProcess.init();
            workProcess.changeState();
        }
    }
}
