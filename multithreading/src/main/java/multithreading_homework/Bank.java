package multithreading_homework;


public class Bank {
    public int moneyAmount;

    public Bank(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public boolean hasEnoughMoney(int amount) {
        return moneyAmount  - amount >= 0;
    }

    public void transferMoney(int amount) throws TransferException {
            if (hasEnoughMoney(amount)) {
                moneyAmount -= amount;
                BankUser.allTakesMoney += amount;
            } else {
                throw new TransferException();
            }

    }

}
