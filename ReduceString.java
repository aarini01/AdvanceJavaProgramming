
import java.util.*;
public class ReduceString {
    public static void main(String[] args) {
   List<String> list = Arrays.asList("java", "stream", "api", "reduce");

        String result = list.stream().reduce("", (a, b) -> a + b);
        System.out.println("Result = " + result);
    }
}
    
    

