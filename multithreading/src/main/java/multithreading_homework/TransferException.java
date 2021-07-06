package multithreading_homework;

public class TransferException extends Exception {
    @Override
    public String getMessage() {
        return "TransferException. The request money amount is greater than exists in the bank";
    }
}
