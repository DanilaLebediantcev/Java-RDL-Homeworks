package multithreading_homework;


public class Main {

    public static void main(String[] args) {
        Bank bank1 = new Bank(200);
        BankUser user1 = new BankUser("Петр",1);
        BankUser user2 = new BankUser("Семен",1);
        BankUser user3 = new BankUser("Андрей",1);


        BankThread th1 = new BankThread("Thread1");
        BankThread th2 = new BankThread("Thread2");
        BankThread th3 = new BankThread("Thread3");



        th1.setUser(user1);
        th1.setBank(bank1);

        th2.setUser(user2);
        th2.setBank(bank1);

        th3.setUser(user3);
        th3.setBank(bank1);


        Thread thread1 = new Thread(th1);
        Thread thread2 = new Thread(th2);
        Thread thread3 = new Thread(th3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
