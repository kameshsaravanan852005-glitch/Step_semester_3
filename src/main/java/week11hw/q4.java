package main.java.week11hw;

public class q4 {

    static int firstBreak(int[] tokens) {

        for (int i = 1; i < tokens.length; i++) {

            if (tokens[i] < tokens[i - 1]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] a = {3, 5, 5, 8, 6, 9};
        int[] b = {1, 2, 2, 7};
        int[] c = {};
        int[] d = {10};

        System.out.println(firstBreak(a));
        System.out.println(firstBreak(b));
        System.out.println(firstBreak(c));
        System.out.println(firstBreak(d));
    }
}