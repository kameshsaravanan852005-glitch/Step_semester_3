package main.java.week11hw;

import java.util.Arrays;

public class q2 {

    static int prizeTable(int[] marks) {
        int swaps = 0;

        for (int i = 0; i < marks.length - 1; i++) {
            int maxIndex = i;

            // Find the highest mark
            for (int j = i + 1; j < marks.length; j++) {
                if (marks[j] > marks[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap only if the position is different
            if (maxIndex != i) {
                int temp = marks[i];
                marks[i] = marks[maxIndex];
                marks[maxIndex] = temp;

                swaps++;
            }
        }

        return swaps;
    }

    public static void main(String[] args) {

        int[] a = {45, 90, 60, 75};
        int[] b = {80, 70, 60};

        int s1 = prizeTable(a);
        int s2 = prizeTable(b);

        System.out.println(Arrays.toString(a) + " swaps = " + s1);
        System.out.println(Arrays.toString(b) + " swaps = " + s2);

        // Own test case
        int[] c = {30, 90, 10, 70};
        int s3 = prizeTable(c);

        System.out.println(Arrays.toString(c) + " swaps = " + s3);
    }
}