import java.util.*;
public class SumOfDigitsReduce {
   public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        int totalSum = list.stream().map(n -> { int sum = 0;while (n > 0) {sum += n % 10; n /= 10;} return sum; })
            .reduce(0, (a, b) -> a + b);
             System.out.println("Total sum of digits = " + totalSum);
    }
}
    

