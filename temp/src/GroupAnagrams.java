import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] strList = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> finalList = getAnagramsLists(strList);

        System.out.println(finalList);

        List<String> collect = finalList.stream().flatMap(f -> f.stream()).collect(Collectors.toList());
        System.out.println(collect);


    }

    private static List<List<String>> getAnagramsLists(String[] strList) {
        Map<String, List<String>> map=new HashMap<>();

        for (String str: strList){

            String sortedString = sortedStringMethod(str);

            if(map.get(sortedString)==null){
                ArrayList<String > list= new ArrayList<>();
                list.add(str);
                map.put(sortedString,list);
            }
            else {
                List<String> stringsList = map.get(sortedString);
                stringsList.add(str);
                map.put(sortedString, stringsList);
            }


        }
        List<List<String>> finalList=new ArrayList<>();
        map.entrySet().forEach(entrySet->{
            List<String> value = entrySet.getValue();
            finalList.add(value);
        });
//        System.out.println(finalList);
        return finalList;
    }

    private static String sortedStringMethod(String str) {
        char[] chars = str.toCharArray();
        for (int s = 0; s < str.length(); s++) {
            for (int i = 0; i < str.length() ; i++) {
                if(chars[s]<chars[i]){
                    char temp=chars[s];
                    chars[s]=chars[i];
                    chars[i]=temp;
                }
            }

        }
//        System.out.println(Arrays.toString(chars));
        String returnString="";
        for (int j = 0; j < str.length(); j++) {
            returnString=returnString+chars[j];

        }
        return returnString;
    }
}
