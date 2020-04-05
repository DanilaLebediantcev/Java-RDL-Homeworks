package multithreading_homework;

public class BankThread implements Runnable {
    private String name;
    BankUser user;
    Bank bank;

    public BankThread(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUser(BankUser user) {
        this.user = user;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        System.out.println("Thread " + getName() + " has been started");
            while (!Thread.currentThread().isInterrupted()) {
                if (bank.hasEnoughMoney(0))
                    user.getSomeMoney(bank);
            }
    }
}

