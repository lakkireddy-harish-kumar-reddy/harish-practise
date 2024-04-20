import java.util.*;


public class SortListDesc {
    public static void main(String[] args) {

        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 == o2)
                    return 0;
                else if (o1 < o2)
                    return 1;
                else
                    return -1;
            }
        };

        List<Integer> numbers = Arrays.asList(34,45,31,29,24);
        Collections.sort(numbers,comp);
        // Instead of overriding comparator you can use this as well to get same output
        // Collections.sort(numbers,Comparator.reverseOrder());
        numbers.forEach(n -> System.out.println(n));

    }



}
