package Programs;

public class ReverseInteger {
    public static void main(String[] args) {

        /**
         * input=132
         * output=231
         */

        int number = -120;  //output -21
        int reverse = 0;

        boolean flag = number < 0 ? true : false;
        if(flag) number=number*(-1);

        while (number > 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;   //3 32 321
            number = number / 10;
        }
        if(flag) reverse=reverse*(-1);
        System.out.println(reverse);



    }
}
