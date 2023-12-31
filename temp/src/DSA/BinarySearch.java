package DSA;

/**
 * Licensed Materials - Property of IBM 6949-80Q © Copyright IBM Corp. 2019 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 *
 * @author 002KA5
 * @project temp
 * @created-on 06/08/22
 */
public class BinarySearch {

    int bSearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }


        }

        //ceiling =smallest element in the array >=target  -> return start value instead of -1
        //floor = greatest element in the array<=target    ->return end value instead of -1


        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 6, 7, 8, 9};
        int target = 3;
        BinarySearch search = new BinarySearch();
        int index = search.bSearch(arr, target);
        if (index == -1) {
            System.out.println("not found");
        } else System.out.println(target + " found with index " + index);

    }

}
