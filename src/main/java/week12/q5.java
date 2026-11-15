package main.java.week12;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] rainfall = new double[7];

        double total = 0;
        int wettestDay = 0;
        int dryDays = 0;

        for (int i = 0; i < 7; i++) {
            rainfall[i] = sc.nextDouble();
        }

        System.out.print("Rainfall (mm): ");

        for (int i = 0; i < 7; i++) {
            System.out.print(rainfall[i] + " ");
        }

        for (int i = 0; i < 7; i++) {
            total += rainfall[i];

            if (rainfall[i] > rainfall[wettestDay]) {
                wettestDay = i;
            }

            if (rainfall[i] == 0) {
                dryDays++;
            }
        }

        double average = total / 7.0;

        System.out.println("\n");
        System.out.println("Total Rainfall: " + total + " mm");

        System.out.printf("Average Rainfall: %.2f mm%n", average);

        System.out.println("Wettest Day: Day " +
            (wettestDay + 1) + " (" +
            rainfall[wettestDay] + " mm)");

        System.out.println("Total Dry Days: " + dryDays);

        sc.close();
    }
}

// Time Complexity: O(7) = O(1)
// Space Complexity: O(7) = O(1)
