package DSA;

/**
 * Licensed Materials - Property of IBM 6949-80Q © Copyright IBM Corp. 2019 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 *
 * @author 002KA5
 * @project temp
 * @created-on 08/09/22
 */
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        char[] crr={'A','A','A','F','F'};
        char charTarget = 'F';
        System.out.println(ans(arr, target));
        System.out.println(charAns(crr, charTarget)+1);
    }
    static int charAns(char[] crr,char target){
        int start=0;
        int end=1;

        while (target!=crr[end]){

            int tempStart=end+1;
            end=end+(end-start)+1*2;
            start=tempStart;
        }
        return binarySearchForChar(crr,start,end,target);
    }

    static int ans(int[] arr,int target){
        int start = 0;
        int end = 1;

        while (target>arr[end]){
            int tempStart=end+1;
            end=end+(end-start)+1*2;
            start=tempStart;
        }
        return binarySearch(arr,target,start,end);

    }
  static int binarySearchForChar(char[] crr,int start,int end ,char target){

        while (start<=end){
            int mid = start + (end - start) / 2;
            if(crr[mid]!=crr[mid-1] && crr[mid]==crr[mid-1] ){
                return mid;
            }
            if(crr[mid]!=crr[mid+1]){
                return mid+1;
            }
            else if(target==crr[mid] && target==crr[mid+1] ){
                end=mid-1;
            }
            else if(target!=crr[mid] && target!=crr[mid+1]) {
                start=mid+1;
            }
        }
        return -1;
  }


    static int binarySearch(int[] arr, int target,int start,int end) {

        while (start <= end) {
            int mid = start + end / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }

        }
        return -1;
    }


}
