package multithreading_homework;

import java.util.Objects;
import java.util.Random;

public class BankUser{
    private int amount;

    static int allTakesMoney = 0;

    private String name;

    public BankUser(String name,int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankUser bankUser = (BankUser) o;
        return Objects.equals(name, bankUser.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    synchronized void getSomeMoney(Bank bank){
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
}
