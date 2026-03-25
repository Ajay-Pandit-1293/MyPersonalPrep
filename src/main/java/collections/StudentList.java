package collections;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {
        List<Students> list = new ArrayList<>();
        list.add(new Students(1,"Gullu",100));
        list.add(new Students(2,"Mera",90));
        list.add(new Students(3,"Dost",80));
        list.add(new Students(4,"test",28));

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).marks < 40) {
                System.out.println("Removing: " + list.get(i).name);
                list.remove(i);
            }
        }
        for (Students s : list ){
            System.out.println(s.id+" "+s.marks+" "+s.name);

        }

    }
}
