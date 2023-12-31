package Programs;

import java.util.Arrays;

/**
 * Licensed Materials - Property of IBM 6949-80Q © Copyright IBM Corp. 2019 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 *
 * @author 002KA5
 * @project temp
 * @created-on 16/01/23
 */
public class FarthestFromZero {

    public static void Farthest(int[] arr) {
        Arrays.sort(arr);
        int l= arr.length;
        if(arr[0]>=0){
            System.out.println(arr[l-1]);
        }
        else if(arr[l-1]<=0){
            System.out.println(arr[0]);
        }
        else {
            int n= arr[0];
            int p= arr[l-1];

            n=n* -1;

            if(n<p){
                System.out.println(p);
            }
            else System.out.println(-n);


        }
    }

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,0};  //test case1
        int[] arr1={-1,-2,-3,-4,-5,-6,0}; //test case 2
        int[] arr2={-1,-2,-7,3,0,4,5,6}; //test case 3
        int[] arr3={-8,0,6};


        Farthest(arr3);

    }


}
