package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateList {
    static List<Integer> list1 = List.of(1,2,3,4,5,6,7,8,9);
    static List<Integer> list2 = Arrays.asList(11,12,13,14,15,16,17,18,19,20);
    // Both List are immutable.

    // Old way to get even number (Without Stream)
    public static List<Integer> printEvenWithoutStream(List<Integer> list){
        List<Integer> listEven = new ArrayList<>();
        for(Integer i : list){
            if (i % 2 == 0){
                listEven.add(i);
            }
        }
        return listEven;
    }

    public static List<Integer> printEvenWithStream(List<Integer>list){
//        Stream<Integer> stream = list.stream();
//        return stream.filter(i-> i % 2 == 0).collect(Collectors.toList());
        return list1.stream().filter(i-> i % 2 == 0).collect(Collectors.toList());
    }

    public static List<Integer> numGreaterThen15(List<Integer> list){
        return list.stream().filter(i-> i > 15).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println(list1);
        System.out.println(list2);
        System.out.println("Even list of list1 without stream is  " + printEvenWithoutStream(list1));
        System.out.println("Even list of list1 with stream is  " + printEvenWithStream(list1));
        System.out.println("Number Greater than 15 in list2 " + numGreaterThen15(list2));
    }
}
