import java.util.*;

public class Optional {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Teddy","Bear","Harsh","ignnore");

        java.util.Optional<String> result = names.stream().filter(x -> x.contains("nn")).findFirst();
        System.out.println(result.get());
        System.out.println(result.orElse("Not found"));

    }



}