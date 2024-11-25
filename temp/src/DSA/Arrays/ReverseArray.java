package DSA.Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        //reverse from particular position
        int M = 3;

        for (int i = M, j = arr.length - 1; i < j; i++, j--) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        Arrays.stream(arr).forEach(a -> {
            System.out.print(a + " ");
        });
    }
}
