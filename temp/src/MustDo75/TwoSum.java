package MustDo75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr={2,7,11,15};
        int[] ints = twoSum(arr, 9);
        Arrays.stream(ints).boxed().forEach(System.out::println);

    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map=new HashMap<>();
        int length=nums.length;

        for (int i = 0; i < length ; i++) {

            int reqNum=target-nums[i];
            if(map.containsKey(reqNum)){
               return new int[]{map.get(reqNum),i};

            }
            map.put(nums[i],i);
        }

        return new int[]{}; // No solution found
    }

}
