package multithreading_homework;


public class Main {

    public static void main(String[] args) {
        Bank bank1 = new Bank(200);
        BankUser user1 = new BankUser("Петр",1,bank1);
        BankUser user2 = new BankUser("Семен",1,bank1);
        BankUser user3 = new BankUser("Андрей",1,bank1);

        Thread thread1 = new Thread(user1);
        Thread thread2 = new Thread(user2);
        Thread thread3 = new Thread(user3);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
