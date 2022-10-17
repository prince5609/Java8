package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ObjectOfStream {
    public static void main(String[] args) {

        // 1 --> Blank
        Stream<Object> empty = Stream.empty();

        // 2 --> Array, Collection, Object
        String [] name = {"Prince", "Tyagi"};
        Stream<String> stream1 = Stream.of(name);
        stream1.forEach(e->{
            System.out.println(e);
        });

        // 3 --> List, Set
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        Stream<Integer> stream2 = list1.stream();
        List<Integer> list = stream2.filter(e->e > 0).collect(Collectors.toList());
        System.out.println(list);
        // can also be written as stream2.forEach(System.out::println)

//        list1.stream().forEach(e->{
//            System.out.println(e);
//        });
    }
}
