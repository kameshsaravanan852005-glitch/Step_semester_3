package main.java.week11hw;

public class q1 {

    static void lineUp(int[] heights) {
        int n = heights.length;
        int pass = 1;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (heights[j] > heights[j + 1]) {
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;

                    swapped = true;
                }
            }

            System.out.println("Pass " + pass + ": " +
                    java.util.Arrays.toString(heights));

            pass++;

            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        int[] heights = {4, 2, 5, 1};

        lineUp(heights);

        int[] heights2 = {1, 3, 2, 4};

        lineUp(heights2);
    }
}