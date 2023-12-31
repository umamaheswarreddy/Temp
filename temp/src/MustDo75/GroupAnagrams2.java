package MustDo75;

import java.util.*;

/*
    13th question
 */
public class GroupAnagrams2 {

    public static void main(String[] args) {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};


        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {


            String sortedString = sortString(str); //return sort
            if (map.get(sortedString) == null) {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sortedString, list);
            } else {
                List<String> list = map.get(sortedString);
                list.add(str);
                map.put(sortedString, list);

            }


        }
        List<List<String>> finalList = new ArrayList<>();
        map.forEach((key, value) -> finalList.add(value));
        System.out.println(finalList);

    }

    private static String sortString(String str) {

        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        /*
        convert char array to string
         */
        return String.valueOf(charArray);

    }


}
