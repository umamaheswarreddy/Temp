package Programs;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Licensed Materials - Property of IBM 6949-80Q © Copyright IBM Corp. 2019 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 *
 * @author 002KA5
 * @project temp
 * @created-on 15/09/22
 */
public class CharStream {



    public static void main(String[] args) {
        String str="basanth";
        Arrays.stream(str.split("")).collect(
                Collectors.groupingBy(Function.identity(),Collectors.counting())

        ).entrySet().forEach(System.out::println);

        System.out.println("============");

        new String(str.toCharArray()).chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Character::charValue,Collectors.counting()))
                .entrySet().forEach(System.out::println);
    }
}
