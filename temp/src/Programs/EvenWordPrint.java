package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenWordPrint {
    public static void main(String[] args) {

        String str="Hell world may hi";


        String[] strList = str.split(" ");
        List<String> collect = Arrays.stream(strList).collect(Collectors.toList());
        List<String> collect2 = Arrays.stream(strList).toList();
        List<String> collect3 = Arrays.stream(str.split(" ")).toList();

        System.out.println(collect);
        System.out.println(collect2);
        System.out.println(collect3);

        collect.stream().filter(e->e.length()%2==0).toList().forEach(System.out::println);

        String s1="java";
        new String(s1.toCharArray()).chars().mapToObj( c ->(char) c).sorted().forEach(System.out::print);

        System.out.println();
        String str1="uma";
        String collect1 = str1.chars().mapToObj(c -> (char) c).sorted().map(Objects::toString).collect(Collectors.joining());
        System.out.println(collect1);

        String str2 = "gbbfh";
        char[] charArray = str2.toCharArray();
        Arrays.sort(charArray);
        System.out.println(charArray);

        String str4 = new String(charArray);
        System.out.println(str4);


    }
}
