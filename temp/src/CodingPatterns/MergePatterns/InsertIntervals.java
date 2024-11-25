package CodingPatterns.MergePatterns;

public class InsertIntervals {

    private static int[][] insert(int[][] intervals, int[] newInterval) {




     return null;
    }

    public static void main(String[] args) {
        // Test Case 1
        int[][] intervals1 = {
                {1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}
        };
        int[] newInterval1 = {4, 8};
        int[][] result1 = insert(intervals1, newInterval1);

        System.out.println("After inserting the interval:");
        for (int[] interval : result1) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }

        // Test Case 2 (Original)
        int[][] intervals2 = {
                {1, 3}, {6, 9}
        };
        int[] newInterval2 = {2, 5};
        int[][] result2 = insert(intervals2, newInterval2);

        System.out.println("\nAfter inserting the interval:");
        for (int[] interval : result2) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }



}
