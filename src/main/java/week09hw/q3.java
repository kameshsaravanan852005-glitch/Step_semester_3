package main.java.week09hw;

import java.util.Scanner;

abstract class Student {
    String name;
    static final double TRANSPORT_FEE = 12000;

    Student(String name) {
        this.name = name;
    }

    abstract double fee();

    abstract boolean usesBus();
}

class DayScholar extends Student {
    DayScholar(String name) {
        super(name);
    }

    double fee() {
        return 40000 + TRANSPORT_FEE;
    }

    boolean usesBus() {
        return true;
    }
}

class Hosteller extends Student {
    Hosteller(String name) {
        super(name);
    }

    double fee() {
        return 40000 + 60000;
    }

    boolean usesBus() {
        return false;
    }
}

class Scholar extends Student {
    Scholar(String name) {
        super(name);
    }

    double fee() {
        return 20000 + TRANSPORT_FEE;
    }

    boolean usesBus() {
        return true;
    }
}

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();

            switch (type) {
                case "DAY_SCHOLAR":
                    students[i] = new DayScholar(name);
                    break;
                case "HOSTELLER":
                    students[i] = new Hosteller(name);
                    break;
                case "SCHOLAR":
                    students[i] = new Scholar(name);
                    break;
            }
        }

        for (Student s : students) {
            double amount = s.fee();
            System.out.printf("%s: %.2f%n", s.name, amount);
            total += amount;
        }

        System.out.printf("Total Collected: %.2f%n", total);
        sc.close();
    }
}
