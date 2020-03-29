package State;

public class WorkProcess {
    ICoffeeMachine coffeeMachine;

    public void setState(ICoffeeMachine newCoffeeMachine){
        this.coffeeMachine = newCoffeeMachine;
    }

    public void changeState(){
        if(coffeeMachine instanceof Start)
            setState(new PrepareCoffee());
        else if (coffeeMachine instanceof PrepareCoffee)
            setState(new Finish());
    }

    public void init(){
        coffeeMachine.init();
    }
}
