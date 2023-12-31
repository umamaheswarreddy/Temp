package Programs;

import java.util.Arrays;
import java.util.*;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class FindFirstNonRepetiveCharinString {
    public static void main(String[] args) {
        
        String str= "progrpamming";


//        String[] split = str.split("");
//        Map<String, Long> map = Arrays.stream(split).collect(Collectors.groupingBy(String::toString, Collectors.counting()));
//        System.out.println(map);
//        String string = map.entrySet().stream().filter(e -> e.getValue().doubleValue() == 1).map(e -> e.getKey()).findFirst().get();
//        System.out.println(string);
        char[] charArray = str.toCharArray();
        String string = new String(charArray).chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Objects::toString, Collectors.counting())).entrySet().stream()
                .filter(e -> e.getValue().doubleValue() == 1).map(e -> e.getKey()).findFirst().get();
        System.out.println(string);



        String input="progrpamming";

        input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("No non-repeating characters found.")
                );


    }
}
