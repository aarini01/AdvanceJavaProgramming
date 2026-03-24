import java.util.*;
public class DuplicateSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(18, 42, 7, 91, 5, 10, 5, 7, 33, 25, 60);
        System.out.println(list);
        List<Integer> result = list.stream().distinct().sorted().toList();
        System.out.println(result);
    }
}
        
    
    

