package Programs;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueValue {

    public static void main(String[] args) {

        int[] intArr = new int[]{1, 2, 3, 4, 2, 1, 4};

        Map<Integer, Integer> integerMap = new HashMap<>();

        for (Integer i : intArr) {

            if (integerMap.get(i) == null) {
                integerMap.put(i, 1);

            } else {
                integerMap.put(i, integerMap.get(i) + 1);
            }

        }
//       integerMap.entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).forEach(System.out::println);

        for (Map.Entry<Integer, Integer> entry : integerMap.entrySet()) {

            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }

    }
}
