package Reference.Method;

import java.util.List;

public class ExampleWithStream {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        list.forEach(System.out::println);
    }
}
