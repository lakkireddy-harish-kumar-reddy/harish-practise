import java.util.*;


public class Stream {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(8,5,1,2,4);

        int result = numbers.stream()
                .filter(n -> n%2==0)
                .map(n-> n *2)
                .reduce(0,(c,e)->c+e);
        System.out.println(result);

    }



}