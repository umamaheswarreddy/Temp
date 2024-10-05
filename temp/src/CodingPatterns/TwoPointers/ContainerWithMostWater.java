package CodingPatterns.TwoPointers;

public class ContainerWithMostWater {

    public static void main(String[] args) {

        int[] height={4,3,2,1,4};

        int water=0;
        int left=0, right=height.length-1;

        while (left < right) {

            /**
             * water = max(water, currentWater)
             * currentWater = height * width
             * height= min(arr[left], arr[right])
             * width=right-left
             */

            water=Math.max(water,Math.min(height[left],height[right]) * (right-left));
            if(height[left] > height[right]){
                right--;
            } else
                left++;

        }
        System.out.println(water);


    }
}
