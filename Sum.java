import java.util.*;
public class Sum {
    public static void main(String[] args) {
       
        List<Integer> list = Arrays.asList(5, 15, 25, 35, 45, 20, 10);

        int sum = list.stream().filter(x -> x > 10 && x < 40).mapToInt(Integer::intValue).sum();
        System.out.println("Sum = " + sum);
    }
}
    
    

