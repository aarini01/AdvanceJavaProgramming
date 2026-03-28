import java.util.Arrays;
import java.util.List;

public class Top3Highest {
    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(10, 20, 5, 40, 15, 60, 70);

        list.stream().sorted((a, b) -> b - a) .limit(3).forEach(System.out::println);
    }
}
   
