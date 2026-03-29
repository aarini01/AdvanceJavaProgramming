import java.util.*;
public class SortedDuplicate {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(23,12,1,45,23,76,26,91);
        System.out.println(list);
        Integer second=list.stream().sorted((a,b)->b-a).toList().get( 1);
         System.out.println(second);
    }
    
}
