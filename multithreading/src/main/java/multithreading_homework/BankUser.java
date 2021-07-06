package multithreading_homework;

import java.util.Random;

public class BankUser implements Runnable{
    private Bank bank;
    private int amount;

    static int allTakesMoney = 0;

    private String name;

    public BankUser(String name,int amount, Bank bank) {
        this.name = name;
        this.amount = amount;
        this.bank = bank;
    }

    public String getName() {
        return name;
    }


    void getSomeMoney(Bank bank){
            try {
                System.out.println(getName() + " - user wants to take the " + amount + " money. Bank has the " + bank.moneyAmount + " money amount. ");
                bank.transferMoney(amount);
                System.out.println("All users take " + BankUser.allTakesMoney);
                Thread.sleep(new Random().nextInt(10) * 20 + 200);
            } catch (TransferException | InterruptedException e) {
                System.out.println(getName() + ":" + e.getMessage());
                Thread.currentThread().interrupt();
            }
        }

    @Override
    public void run() {
        System.out.println("Thread " + getName() + " has been started");
        while (!Thread.currentThread().isInterrupted()) {
            if (bank.hasEnoughMoney(0))
                getSomeMoney(bank);
        }
    }
}
