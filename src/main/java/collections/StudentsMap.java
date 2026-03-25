package collections;

public class StudentsMap {
    int marks;
    String name;
    public StudentsMap(int marks , String name){
        this.marks=marks;
        this.name=name;
    }
    @Override
    public String toString() {
        return "Marks: " + marks + ", Name: " + name;
    }
}
