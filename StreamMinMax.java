import java.util.*;
public class StreamMinMax {

public static void main(String[] args) {
    List<Integer> list = Arrays.asList(12,1,14,100,200,150,45,67,99);
    List<Integer> sortedList=list.stream().sorted((a,b)->0).toList();
    
    System.out.println(list);
    System.out.println(sortedList);
    Optional<Integer> result=list.stream().min((a,b)->a-b);
     result.ifPresent(System.out::println);


}
}