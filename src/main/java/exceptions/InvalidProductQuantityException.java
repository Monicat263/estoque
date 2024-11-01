package exceptions;

public class InvalidProductQuantityException  extends IllegalArgumentException{
    public InvalidProductQuantityException(String message){
        super(message);
    }
    public InvalidProductQuantityException(String message, Throwable cause){
        super(message,cause);
    }
}

