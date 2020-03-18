package multithreading_homework;


public class Bank {
    public static int moneyAmount;

    public Bank(int moneyAmount) {
        Bank.moneyAmount = moneyAmount;
    }

    public long getMoneyAmount() {
        return moneyAmount;
    }


    public static boolean hasEnoughMoney(int amount) {
        return moneyAmount  - amount >= 0;
    }

    public static void transferMoney(int amount) throws TransferException {
            if (hasEnoughMoney(amount)) {
                moneyAmount -= amount;
                BankUser.allTakesMoney += amount;
            } else {
                throw new TransferException();
            }

    }

}
