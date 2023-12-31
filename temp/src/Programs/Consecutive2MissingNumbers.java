package Programs;

import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * You are given a list of n-2 integers and these integers are in the range of 1 to n.
 * There are no duplicates in the list. 2 consecutive integers are missing in the list.
 * Write an efficient code to find the missing integers.
 */


public class Consecutive2MissingNumbers {
    public static void main(String[] args) {
        /**
         * Input: arr[] = {1, 2, 6, 3, 7, 8}
         * Output: 4,5
         * Explanation: The missing numbers from 1 to 8 are 4,5
         *
         * Input: arr[] = {1, 2, 5}
         * Output: 3,4
         * Explanation: The missing numbers from 1 to 5 are 3,4
         */

        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 10};
        int brr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 10};

        Arrays.sort(arr);
        List list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(list);
        int n = arr[arr.length - 1];
        for (int i = 1; i < n; i++) {
            if (!list.contains(i)) {
                System.out.println(i);
            }
        }

        System.out.println("======================================");

        int[] nums = new int[]{1, 2, 3, 1};

        String s1="mahesh suresh naresh";
        String s = Arrays.stream(s1.split(" ")).collect(Collectors.toMap(val -> val, val -> val.length()))
                .entrySet().stream().filter(e -> e.getKey().startsWith("m")).
                map(e -> e.getKey())
                .findFirst().get();
        System.out.println(s);

       /* Stream<int[]> nums1 = Stream.of(nums);
        Arrays.stream(nums);
        Stream.of(nums).forEach(System.out::println);


        Arrays.stream(nums).forEach(System.out::println);*/

        int max=0;
        List<String> stringList = Arrays.asList("uma", "reddy", "uma", "mahesh","mahesh");

        Set<Map.Entry<String, Long>> entrySet = stringList.stream().collect(Collectors.groupingBy(String::valueOf, Collectors.counting())).entrySet();
        for (Map.Entry<String, Long> entry:entrySet){
            if(max<entry.getValue()){
               max= Math.toIntExact(entry.getValue());
            }
        }
        int finalMax = max;
        List<String> collect = entrySet.stream().filter(map -> map.getValue() == finalMax).map(map -> map.getKey()).collect(Collectors.toList());
        if(collect.size()==1){
            System.out.println(collect.get(0));
        }
        else {
            System.out.println(collect.stream().sorted().findFirst().get());
        }


    }





}