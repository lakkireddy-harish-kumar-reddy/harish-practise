import java.util.*;

public class MethodRefEx {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Teddy","Bear","Harsh","Ignore");

        List<String> unames = names.stream().map(String::toUpperCase).toList();

        unames.forEach(System.out::println);

    }



}