import java.util.*;
import java.util.stream.Collectors;

public class Rakutan {
    public static void main(String[] args) {

        Map<String,Integer> jsp=new HashMap<>();
        List<String> stringsList = Arrays.asList("susan", "starker", "uma", "mahesh", "susan", "uma");
        Set<Map.Entry<String, Long>> entrySet = stringsList.stream().collect(Collectors.groupingBy(String::valueOf, Collectors.counting())).entrySet();
        stringsList.stream().collect(Collectors.groupingBy(String::toString, Collectors.counting()))
                .entrySet().stream()
                .forEach(e->{
                    int v= (int) (e.getValue()*2);
//                    System.out.println(e.getKey()+" :"+v);
                    jsp.put(e.getKey(),v);
                });

        jsp.entrySet().stream().forEach(e->{
            System.out.println(e.getKey()+"("+ e.getValue()+" yen)");
        });

    }
}
