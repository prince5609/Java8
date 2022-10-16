package StreamAPI;

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
    }
}
