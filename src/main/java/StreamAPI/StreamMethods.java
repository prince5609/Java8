package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {

    // 1-->  filter(predicate)
    //                  |___> boolean value

    // Filter out names started with letter A
    public static List<String> nameWithA(List<String> list){
        return list.stream().filter(e-> e.startsWith("A")).collect(Collectors.toList());
    }


    // 2 -->  map(function) --> perform operation on each element
    //             |___> return value

    // Return square of each element
    public static List<Integer> square(List<Integer> list){
       return  list.stream().map(e->e * e).collect(Collectors.toList());
    }

    // 3 --> forEach  perform operation on each

    // add 5 if number is even
    public static List<Integer> addFive(List<Integer> list){
        List<Integer> newList = new ArrayList<>();
        list.forEach(e->{
            if(e % 2 == 0){
                e += 5;
                newList.add(e);
            }
        });
        return newList;
    }
    // 4 --> sorted

    // sort given list
    public static List<Integer> sortNumber(List<Integer> list){
        return list.stream().sorted().collect(Collectors.toList());
    }

    // 5 --> min / max
    public static int findMin(List<Integer> list){
        return list.stream().min(Integer::compareTo).get();
//      return list.stream().min((x, y)-> x.compareTo(y)).get();
    }

    public static void main(String[] args) {
        List<String> name = List.of("Aman", "Raghav", "Ansh", "Aryan", "Prince");
        System.out.println(nameWithA(name));

        System.out.println("-----------------------");

        List<Integer> number = List.of(1,2,3,4,5);
        System.out.println(square(number));

        System.out.println("-----------------------");

        System.out.println(addFive(number));

        System.out.println("-----------------------");

        List<Integer> number2 = List.of(9,6,4,8,2,3,1,7);
        System.out.println(sortNumber(number2));

        System.out.println("-----------------------");

        System.out.println("Min in list " + number2 + " is " + findMin(number2));

    }
}
