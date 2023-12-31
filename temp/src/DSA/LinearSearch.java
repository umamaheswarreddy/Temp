package DSA;

/**
 * Licensed Materials - Property of IBM 6949-80Q © Copyright IBM Corp. 2019 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 *
 * @author 002KA5
 * @project temp
 * @created-on 06/08/22
 */
public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 6, 9, 7};
        int target =9;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==target){
                System.out.printf(target+" found at index "+i);
                return;
            }
        }
        System.out.println("target not found");
        return;


    }
}
