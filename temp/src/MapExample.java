

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.Map.Entry;

public class MapExample {

  public static void main(String args[]) throws ParseException {
    Map<String, Integer> map = new HashMap<>();
    map.put("A", 1);
    map.put("B", 2);
    map.put("C", 3);
    map.put("D", 4);
    map.put("E", 5);
    map.put("F", null);

    List<String> supplierNames = new ArrayList<>();
    supplierNames.add("sup1");
    supplierNames.add("sup2");
    supplierNames.add("sup3");
    supplierNames.add(null);

//    supplierNames.forEach(name->{
//      System.out.println(name.toString());
//    });
    System.out.println(new Date());
    System.out.println(LocalDateTime.now());

    SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    isoFormat.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
    Date today = isoFormat.parse(String.valueOf(LocalDateTime.now()));
    System.out.println(today);

   /* //Before Java 8
    System.out.println("Before Java 8 ");
    for (Entry<String, Integer> entry : map.entrySet()) {
      System.out.println("Key is :" + entry.getKey() + " value is :" + entry.getValue());
    }
    //From Java 8 Onwards
    System.out.println("Java 8 forEach Example :: ");
    map.forEach((key, value) ->
        System.out.println("Key is :" + key + " value is :" + value));*/

//    map.forEach((key, value) -> {
////     if (Objects.nonNull(key) || Objects.nonNull(value)) {
//        System.out.println("Key is :" + key + " value is :" + value);
////     }
//    });
  }


}