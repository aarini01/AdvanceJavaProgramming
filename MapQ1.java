
// import java.util.*;
// public class MapEx {
//     public static void main(String[] args) {
//         List<Integer> numbers=Arrays.asList(23,32,45,35,67,89,95);
//         System.out.println(numbers);
//         List<Integer> result=(List<Integer>) numbers.stream().map(n->n+5).toList();
//         System.out.println(result);

//     }
    
// }

import java.util.Arrays;
import java.util.List;

public class MapQ1 {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("sachin","rahul","amit");
       // ArrayList<Integer> list=new ArrayList<Integer>();
        //list.addAll(numbers);
        System.out.println(list);
        List<String> result=(List<String>) list
        .stream()
        //.filter(n->n)
        .map(n->n.toUpperCase()).toList();
        System.out.println(result);
    }
}

