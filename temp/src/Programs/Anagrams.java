package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Anagrams {

    public static void main(String[] args) {

       /* String myStr="ABCD,BACD";
        String[] split = myStr.split(",");
        String s1 = split[0];
        String s2 = split[1];*/

        String str1="ABCD";
        String str2="BACD";


        char[] charsArr1 = str1.toCharArray();
        char[] charsArr2 = str2.toCharArray();

        Set<Character> charTree1=new TreeSet<>();
        Set<Character> charTree2=new TreeSet<>();

        for(Character cr: charsArr1){
            charTree1.add(cr);
        }
        for(Character cr: charsArr2){
            charTree2.add(cr);
        }
        System.out.println("Anagrams "+charTree1.equals(charTree2));
        System.out.println("===========================2nd way comapring hashSet Keys===============================================");

        Map<Character, Integer> entrySet1=new HashMap<>();
        Map<Character, Integer> entrySet2=new HashMap<>();

        for(Character cr: charsArr1){
            entrySet1.put(cr,cr.hashCode());
        }
        for(Character cr: charsArr2){
            entrySet2.put(cr,cr.hashCode());
        }
        System.out.println(entrySet1.keySet());
        System.out.println(entrySet2.keySet());

        System.out.println("HashMap Anagrams "+entrySet1.keySet().equals(entrySet2.keySet()));







    }



}
