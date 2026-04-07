import java.util.*;

public class ReduceEx {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(34,12,45,76,34,56,54,32);

        int mul = list.stream().reduce(1, (a, b) -> a * b);

        System.out.println("Multiply = " + mul);
    }
}

