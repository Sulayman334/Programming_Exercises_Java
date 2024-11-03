package Chapter_10_OOP.ExceptionHandlingAndFileReader.BankingSystem;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
