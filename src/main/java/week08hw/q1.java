package main.java.week08hw;

import java.util.*;

abstract class Payment {
    protected double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract double getAmount();
    abstract String getType();
}

class Card extends Payment {
    Card(double amount) {
        super(amount);
    }

    double getAmount() {
        return amount * 1.02;
    }

    String getType() {
        return "CARD";
    }
}

class Wallet extends Payment {
    Wallet(double amount) {
        super(amount);
    }

    double getAmount() {
        return amount * 1.01;
    }

    String getType() {
        return "WALLET";
    }
}

class BankTransfer extends Payment {
    BankTransfer(double amount) {
        super(amount);
    }

    double getAmount() {
        return amount;
    }

    String getType() {
        return "BANKTRANSFER";
    }
}

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double amount = sc.nextDouble();

            Payment payment;

            switch (type) {
                case "CARD":
                    payment = new Card(amount);
                    break;
                case "WALLET":
                    payment = new Wallet(amount);
                    break;
                default:
                    payment = new BankTransfer(amount);
            }

            double result = payment.getAmount();
            total += result;

            System.out.printf("%s: %.2f%n", payment.getType(), result);
        }

        System.out.printf("Total: %.2f%n", total);
    }
}
