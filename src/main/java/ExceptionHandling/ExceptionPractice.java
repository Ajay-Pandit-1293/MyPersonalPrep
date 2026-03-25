package ExceptionHandling;

public class ExceptionPractice {
    public static void main(String[] args) {
        String[] students = {"Ajay", "Pratyush", "Aniket"};
        try {
            System.out.println(students[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("This is the error we're talking about : "+e.getMessage());
        }finally {
            System.out.println(" THis is the finally");
        }
        }
}
