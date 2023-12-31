package Programs;

import java.util.Arrays;

/**
 * Licensed Materials - Property of IBM 6949-80Q © Copyright IBM Corp. 2019 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 *
 * @author 002KA5
 * @project temp
 * @created-on 17/08/22
 */
public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {


        int[] result=new int[nums.length-k+1];
        int maxSum=0;

        int start;
        int end=k;
        int index=0;

        for(start=0;end<=nums.length;start++,end++){

            int windowSum=0;
            for(int i=start;i<end;i++){

                if(windowSum<nums[i]){
                  windowSum=nums[i];
                }

            }
//            maxSum=Math.max(maxSum,windowSum);
            result[index++]=windowSum;


        }


        return result;
    }

    public static void main(String[] args) {
//        int[] nums = {1,3,-1,-3,5,3,6,7};
        int[] nums = {1,-1};
        int k = 1;
        int[] ints = maxSlidingWindow(nums, k);
        System.out.println("======================");
        Arrays.stream(ints).forEach(System.out::println);

    }
}
