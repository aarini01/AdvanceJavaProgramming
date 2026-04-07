import java.util.*;

    
public class SortedHighest {
    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(18, 42, 7, 91, 33, 25, 60);
       System.out.println(list);
       List<Integer> sortedList = list.stream().sorted((a, b) -> b - a).limit(3) .toList();
       System.out.println(sortedList);
    }
}
    
    

