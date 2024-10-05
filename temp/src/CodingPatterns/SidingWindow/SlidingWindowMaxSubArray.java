package CodingPatterns.SidingWindow;


/*
https://www.youtube.com/watch?v=__guhvzO540
 */

public class SlidingWindowMaxSubArray {
    private static int maxSubArray(int[] arr, int k) {

        int wSum = 0;
        int tSum = 0;

        for (int i = 0; i < k; i++) {
            wSum = wSum + arr[i];
        }

        for (int end = k; end < arr.length; end++) {

            wSum = wSum + arr[end] - arr[end - k];
            tSum = Math.max(wSum, tSum);

        }

        return tSum;
    }

    public static void main(String[] args) {

        int[] arr = {1, 9, -1, -2, 7, 3, -1, -2};

        int maxSubArray = maxSubArray(arr, 4);
        System.out.println("maxSubArray:" + maxSubArray);
    }
}
