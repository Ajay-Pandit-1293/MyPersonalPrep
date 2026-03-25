package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) throws InterruptedException {
        Set<String> set = new HashSet<>();
        Thread thread = new Thread();
        set.add("Java");set.add("Firebase");set.add("Android");set.add("Java");set.add("Python");set.add("Android");
        thread.sleep(3000);
        if (!set.contains("Spring Boot")){
            set.add("Spring Boot");
            thread.sleep(3000);
            System.out.println("Spring Boot Added Successfully !");
            thread.sleep(3000);

        }
        if(set.contains("Java")){
            System.out.println("Yes Java Exists");
            thread.sleep(3000);
        }
        set.remove("Python");

        System.out.println("Python removed Successfully !\n Final Set is: ");
        thread.sleep(3000);
        for(String s : set){
            System.out.println(s);
        }

    }
}
