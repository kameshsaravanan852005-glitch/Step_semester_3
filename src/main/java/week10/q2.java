package main.java.week10;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        String rev = sb.reverse().toString();

        if (s.equals(rev)) {
            System.out.println(rev + " - palindrome");
        } else {
            System.out.println(rev + " - not a palindrome");
        }

        sc.close();
    }
}
