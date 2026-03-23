import java.util.*;
public class LongString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "programming", "stream", "api", "functional");
        String longest = list.stream().reduce("", (a, b) -> a.length() > b.length() ? a : b);
        System.out.println("Longest String = " + longest);
    }
}
    
   
