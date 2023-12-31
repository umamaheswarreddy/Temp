package Programs;

/**
 * Licensed Materials - Property of IBM 6949-80Q © Copyright IBM Corp. 2019 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 *
 * @author 002KA5
 * @project temp
 * @created-on 17/08/22
 */
public class ContainerWithMostWater {

    public static int maxArea(int[] a) {
        int area = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {

                int tempArea = Math.min(a[i], a[j]) * (j - i);
                area = Math.max(area, tempArea);

            }
        }
        return area;

    }

    public static int maxAreaOn(int[] a) {

        int left = 0;
        int right = a.length - 1;
        int area = 0;

        while (left < right) {
           // Calculating the max area height * Length
            area = Math.max(area,
                    Math.min(a[left], a[right]) * (right - left));

            if(a[left]<a[right]){
                left++;
            }
            else
                right--;


        }

        return area;
    }


    public static void main(String[] args) {
        int a[] = {1, 5, 4, 3};
        int b[] = {3, 1, 2, 4, 5};

        System.out.println(maxAreaOn(a));
        System.out.println(maxAreaOn(b));
    }


}
