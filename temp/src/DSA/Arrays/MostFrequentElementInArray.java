package DSA.Arrays;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElementInArray {


    private static int mostFrequent(int[] arr, int n) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        int max_count = 0, res = -1;
        for (Map.Entry<Integer, Integer> hm : map.entrySet()) {
            if (max_count < hm.getValue()) {
                res = hm.getKey();
                max_count = hm.getValue();
            }

        }

        System.out.println(res + ": " + map.get(res));
        return res;
    }


    public static void main(String[] args) {
        int[] arr = {40, 50, 30, 40, 50, 30, 30};
        int n = arr.length;
        System.out.print(mostFrequent(arr, n));
    }
}
