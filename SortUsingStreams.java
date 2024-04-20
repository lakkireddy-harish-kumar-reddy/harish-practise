import java.util.*;

public class SortUsingStreams {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(8,5,1,2,4);

        java.util.stream.Stream<Integer> sort_asc = numbers.stream().sorted();

        java.util.stream.Stream<Integer> sort_desc = numbers.stream().sorted(Comparator.reverseOrder());

        sort_asc.forEach(n -> System.out.println(n));
        System.out.println("*****************************");
        sort_desc.forEach(n -> System.out.println(n));

    }



}