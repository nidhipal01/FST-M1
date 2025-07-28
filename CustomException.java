package Activities;

public class CustomException extends Exception {
    // Private variable to hold the exception message
    private String message= null;

    // Constructor that initializes the message variable
    public CustomException(String message) {
        this.message = message;
    }

    // Override the getMessage() method from Exception
    @Override
    public String getMessage() {
        return message;
    }
}