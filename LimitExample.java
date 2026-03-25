import java.util.*;
public class LimitExample {
    public static void main(String[] args) {
    List<Integer> list = Arrays.asList(10, 20, 5, 40, 15, 60, 70);
    list.stream().limit(4).forEach(System.out::println);
    }
}


    
