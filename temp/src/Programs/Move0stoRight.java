package Programs;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Licensed Materials - Property of IBM 6949-80Q © Copyright IBM Corp. 2019 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 *
 * @author 002KA5
 * @project temp
 * @created-on 03/09/22
 */
public class Move0stoRight {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 4, 6, 7, 9,7};
        Set set=new TreeSet();
        Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Integer::intValue,Collectors.counting())).entrySet().
                forEach(map->{

                    if(map.getValue()>1){
                        set.add(map.getKey());
                    }
                });

        System.out.println(set);


          String str="aabbccc";

        Map<Character, Long> collect = new String(str.toCharArray()).chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(Character::charValue, Collectors.counting()));
        
        long count=0;
        char key = 0;
        for (Map.Entry<Character, Long> entry : collect.entrySet()){
            
            if(count<entry.getValue()){
                count= entry.getValue();
                 key=entry.getKey();
            }
            
           
        }
        System.out.println(collect.get(key));
        String out="";
        for (int i = 1; i <=3 ; i++) {
            out=out+key;

        }
        System.out.println(out);
        
        
                  
                  







        /*List<Integer> collect = Arrays.stream(a).boxed().collect(Collectors.toList());
        collect.stream().collect(Collectors.toMap(Integer::intValue,Integer::intValue)).entrySet()
                .forEach(System.out::println);*/

       /* String str="hello world hi hi";

        Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(String::valueOf,Collectors.counting()))
                .entrySet().forEach(System.out::println);
*/




        /*int count = 2;
        int[] ints = Arrays.stream(a).filter(value -> value != 0).toArray();

        int[] temp = new int[ints.length + count];
        int i = 0;
        for (; i < ints.length; i++) {

            temp[i] = ints[i];

        }
        int j = i + 1;
        for (; j < temp.length; j++) {
            temp[j] = 0;
        }*/

//        System.out.println(Arrays.toString(temp));




    }
}
