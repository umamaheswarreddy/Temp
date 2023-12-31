package Programs;

import java.util.Arrays;

/**
 * Licensed Materials - Property of IBM 6949-80Q © Copyright IBM Corp. 2019 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 *
 * @author 002KA5
 * @project temp
 * @created-on 05/09/22
 */
public class SubString {

    public static boolean isPalindrome(String str){

        int j=str.length()-1;
        for (int i = 0; i<j ; i++,j--) {
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("madam"));


        String str = "forgeeksskeegfor";
        String fil = "";
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                if (isPalindrome(str.substring(i, j))) {
                    int length = str.substring(i, j).length();
                    if (max < length) {
                        max = length;
                        fil = str.substring(i, j);

                    }
                }

            }

        }
        System.out.println(fil);







        int[] n={2,3,1,5,8,6};
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if(n[i]>n[j]){
                    int temp=n[i];
                    n[i]=n[j];
                    n[j]=temp;
                }
            }

        }
        System.out.println(Arrays.toString(n));
    }
}
