package Programs;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesinString {
    public static void main(String[] args) {

        String str = "sandeep";

        char[] charArray = str.toCharArray();

        Set<Character> set=new LinkedHashSet<>();
        for(char ch: charArray){
            set.add(ch);
        }

        set.forEach(System.out::print);

        System.out.println("========================");

        String s1 = "sandeep";

        List<Character> collect = s1.chars().mapToObj(c -> (char) c).distinct().collect(Collectors.toList());
        System.out.println(collect);

        String collect1 = collect.stream().map(Objects::toString).collect(Collectors.joining());
        System.out.println(collect1);


    }
}
