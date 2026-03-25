package collections;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String messege){
        super(messege);
    }
}
