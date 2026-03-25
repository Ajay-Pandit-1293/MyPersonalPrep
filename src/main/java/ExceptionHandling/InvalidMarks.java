package ExceptionHandling;

import java.util.Scanner;

public class InvalidMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks : ");
        int marks = sc.nextInt();
        try{
            validateMarks(marks);
        } catch (InvalidMarksException e){
            System.out.println("Marks filling error ! "+e.getMessage());
        }

    }
    public static void validateMarks(int marks){
        if (marks<0){
            throw new InvalidMarksException("Marks cannot be negative !");
        } else if (marks>100) {
            throw new InvalidMarksException("Marks cannot be greater than 100!");
        }
        System.out.println("Valid Marks :"+marks);

    }
}
