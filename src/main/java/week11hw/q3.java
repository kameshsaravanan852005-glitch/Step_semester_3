package main.java.week11hw;

import java.util.Arrays;

public class q3 {

    static void shelf(int[] books) {

        for (int i = 1; i < books.length; i++) {

            int key = books[i];
            int j = i - 1;

            // Move bigger books one position to the right
            while (j >= 0 && books[j] > key) {
                books[j + 1] = books[j];
                j--;
            }

            // Place the new book in the correct position
            books[j + 1] = key;

            System.out.println("After placing " + key + ": "
                    + Arrays.toString(books));
        }
    }

    public static void main(String[] args) {

        int[] books = {30, 10, 40, 20};

        shelf(books);

        // Own test case
        int[] b = {50, 20, 40, 10};
        shelf(b);
    }
}