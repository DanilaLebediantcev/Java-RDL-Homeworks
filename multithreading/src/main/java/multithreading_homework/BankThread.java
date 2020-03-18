package multithreading_homework;

import java.util.Random;

public class BankThread extends Thread {
    private int amount;

    public BankThread(String name, int amount) {
        super(name);
        this.amount = amount;
    }

    @Override
    public synchronized void run() {
        System.out.println("Thread " + getName() + " has been started");
        while (Bank.hasEnoughMoney(0)) {
            try {
                Thread.sleep(new Random().nextInt(10) * 20 + 100);
                System.out.print(getName() + " - user wants to take the " + amount + " money. Bank has the " + Bank.moneyAmount + " money amount. ");
                Bank.transferMoney(amount);
                System.out.println("All users take " + BankUser.allTakesMoney);
            } catch (TransferException | InterruptedException e) {
                System.out.println(getName() + ":" + e.getMessage());
                break;
            }
        }
    }
}
