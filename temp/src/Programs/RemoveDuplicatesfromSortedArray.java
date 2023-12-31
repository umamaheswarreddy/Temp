package Programs;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Licensed Materials - Property of IBM 6949-80Q © Copyright IBM Corp. 2019 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 *
 * @author 002KA5
 * @project temp
 * @created-on 21/11/22
 */
public class RemoveDuplicatesfromSortedArray {
    static void removeDups(int[] a, int n)
    {
        Map<Integer, Boolean> map=new LinkedHashMap<>();

        for (int i = 0; i < n; ++i) {

            if(map.get(a[i])==null){
                System.out.print(a[i] + " ");
                map.put(a[i],true);
            }

        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 3};

        int res = 1;
        for(int i = 1; i < nums.length; i++){

            if(nums[i] != nums[i - 1]){
                nums[res] = nums[i];
                res++;
            }
        }
        System.out.println(res);

        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");








        System.out.println("===============HASHMAP============");

        int[] arr1 = { 1, 2, 5, 1, 7, 2, 4, 2 };
//        Arrays.sort(arr1);

        int n = arr1.length;
        removeDups(arr1, n);

    }

}
