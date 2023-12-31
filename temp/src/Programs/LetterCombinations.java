package Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Licensed Materials - Property of IBM 6949-80Q © Copyright IBM Corp. 2019 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 *
 * @author 002KA5
 * @project temp
 * @created-on 21/02/23
 */
public class LetterCombinations {

    public static void main(String[] args) {

        String str = "2";
        String s1="abc";
        String s2="def";

        List<String> output=new ArrayList<>();

        Map<String, String> map=new HashMap<>();

        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");


        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {

                output.add(s1.charAt(i)+""+s2.charAt(j));

            }

        }
        System.out.println(output);

    }
}
