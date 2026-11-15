package main.java.week12;


import java.util.Scanner;

interface PaymentMode {
    double processPayment(double amount);
    double getFee();
    String getMode();
}

class CashPayment implements PaymentMode {
    public double processPayment(double amount) {
        return amount;
    }

    public double getFee() {
        return 0;
    }

    public String getMode() {
        return "Cash";
    }
}

class CardPayment implements PaymentMode {
    public double processPayment(double amount) {
        return amount + amount * 0.02;
    }

    public double getFee() {
        return 0.02;
    }

    public String getMode() {
        return "Card";
    }
}

class UpiPayment implements PaymentMode {
    public double processPayment(double amount) {
        return amount;
    }

    public double getFee() {
        return 0;
    }

    public String getMode() {
        return "UPI";
    }
}

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PaymentMode[] payments = new PaymentMode[n];
        double[] amounts = new double[n];

        for (int i = 0; i < n; i++) {
            String mode = sc.next();
            double amount = sc.nextDouble();

            amounts[i] = amount;

            if (mode.equals("Cash")) {
                payments[i] = new CashPayment();
            } else if (mode.equals("Card")) {
                payments[i] = new CardPayment();
            } else {
                payments[i] = new UpiPayment();
            }
        }

        double total = 0;

        for (int i = 0; i < n; i++) {
            double processed =
                payments[i].processPayment(amounts[i]);

            double fee = processed - amounts[i];

            System.out.println(payments[i].getMode() +
                ": amount " + amounts[i] +
                ", fee " + fee +
                ", processed " + processed);

            total += processed;
        }

        System.out.println("Total Amount Processed: " + total);

        sc.close();
    }
}

// Time Complexity: O(n)