package ExceptionHandling;

public class InvalidMarksException extends RuntimeException {
   public InvalidMarksException(String message){
        super(message);
    }
}
