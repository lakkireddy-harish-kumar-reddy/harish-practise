import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public int compareTo(Student that) {
        if(this.age > that.age)
            return 1;
        else
            return -1;
    }

}

public class ComparableAndComparator {
    public static void main(String[] args) {
//Comparator demo
        Comparator<Integer> comp = ( o1, o2) -> (o1%10 > o2%10) ? 1 : -1;

        List<Integer> numbers = new ArrayList<>();
        numbers.add(34);
        numbers.add(45);
        numbers.add(31);
        numbers.add(19);
        numbers.add(24);
        Collections.sort(numbers,comp);
        for(Integer i : numbers)
            System.out.println(i);

        System.out.println("**************************************************");
// Comparable demo
        List<Student> stud = new ArrayList<>();
        stud.add(new Student(18,"Harish"));
        stud.add(new Student(24,"Ganesh"));
        stud.add(new Student(25,"Gayathri"));
        stud.add(new Student(24,"Praveen"));

        Collections.sort(stud);

        for(Student s : stud)
            System.out.println(s.age + " - " + s.name);
    }



}