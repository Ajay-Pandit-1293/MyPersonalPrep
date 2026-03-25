package collections;

import java.util.HashMap;
import java.util.Scanner;

public class StudentHashMap {
    public static void main(String[] args) {
        HashMap<Integer,StudentsMap> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the searching id : ");
        int id =sc.nextInt();

        map.put(1,new StudentsMap(100,"Gullu"));
        map.put(2,new StudentsMap(100,"Gullu"));
        map.put(3,new StudentsMap(100,"Gullu"));
        map.put(4,new StudentsMap(100,"Gullu"));

        for (int s : map.keySet()){
            System.out.println( "key :"+s+" value "+map.get(s));
        }
        try {
            checkStudent(id,map);
        }catch(StudentNotFoundException e){
            System.out.println("Error : " + e.getMessage());
        }finally{
            sc.close();
        }
    }
    public static void checkStudent(int id , HashMap map){
        if(!map.containsKey(id)){
            throw new StudentNotFoundException("Student not found , its a wrong key");
        }
        System.out.println(" This is the valid id : " +id);
    }
}
