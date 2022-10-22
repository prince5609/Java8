package OptionalClass;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        String str1 = "This is a String";
        String str2 = null;

        Optional<String> optional1 = Optional.ofNullable(str1);
        Optional<String> optional2 = Optional.ofNullable(str2);
        System.out.println(optional1.isPresent());  // To check str is null or not
        System.out.println(optional2.isPresent());

        System.out.println(optional1.get());   // can't be used with str2 as it's blank
        System.out.println(optional1.orElse("As Original is null am here"));
        // If str is not null original str will be returned else this new str will be returned
        System.out.println(optional2.orElse("As Original is null am here"));
    }
}
