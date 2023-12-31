package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class JavaStreams {
    public static void main(String[] args) {


        int[] list = {10, 20, 9, 11, 50, 15};
        List<Integer> integerList = Arrays.stream(list).boxed().toList();
        Integer maxvalue = integerList.stream().max(Comparator.comparingInt(Integer::intValue)).get();
        System.out.println(maxvalue);
        Integer minValue = integerList.stream().min(Comparator.comparingInt(Integer::intValue)).get();
        System.out.println(minValue);


    }
}
