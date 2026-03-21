// package unit3;
// import java.util.*;
// import java.util.List;
// public class FilterAPI {

// }  
//  public static void main(String[] args) {
//         List<Integer> list= new ArrayList<Integer>();
//         list.add(23);
//         list.add(45);
//         list.addAll(List.of(23,56,78,23,45,67));
//         System.out.println(list);
//         Stream listStream=list.stream();
//         listStream.for
        
//     }
    
// }
// package unit3;
import java.util.*;
import java.util.stream.*;

//public interface Consumer

public class FilterAPI {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(23);
        list.add(45);
        list.addAll(List.of(23,56,78,23,45,67));
        System.out.println(list);
        Stream listStream=list.stream();
        list.stream().filter(n->n>60).forEach((element)->System.out.println(element+" "));
        // listStream.forEach(System.out::println);
        System.out.println("Count="+list.stream().filter((item)->item>60).count());
    }
}
