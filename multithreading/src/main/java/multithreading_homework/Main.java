package multithreading_homework;


public class Main {

    public static void main(String[] args) {
        Bank bank1 = new Bank(5000);
        BankUser user1 = new BankUser("Петр");
        BankUser user2 = new BankUser("Семен");


        BankThread th1 = new BankThread("Thread1", 10);
        BankThread th2 = new BankThread("Thread2", 10);
        BankThread th3 = new BankThread("Thread3", 5);
        BankThread th4 = new BankThread("Thread4", 30);

        th1.start();
        th2.start();
        th4.start();
        th3.start();
    }


}
