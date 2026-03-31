import java.util.*;
public class Odd {
    public static void main(String[] args) {
          List<Integer> list = Arrays.asList(5, 15, 25, 35, 45, 20, 10);

        int result = list.stream().filter(x -> x > 20 && x % 2 != 0).min(Integer::compare).get();
        System.out.println("Smallest odd number > 20 = " + result);
    }
}
    
    

