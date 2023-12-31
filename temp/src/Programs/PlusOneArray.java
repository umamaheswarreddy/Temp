package Programs;

import java.util.Arrays;

public class PlusOneArray {

    static public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }



    public static void main(String[] args) {

//           int[] digits={1,2,3};
           int[] digits={8,9};
           plusOne(digits);
        Arrays.toString(plusOne(digits));

    }

}
