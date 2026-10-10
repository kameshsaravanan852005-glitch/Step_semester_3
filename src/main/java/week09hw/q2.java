package main.java.week09hw;


import java.util.Scanner;

interface Insurable {
    double insurance();
}

abstract class Parcel {
    double weight, value;

    Parcel(double weight, double value) {
        this.weight = weight;
        this.value = value;
    }

    abstract double charge();

    double total() {
        return charge();
    }
}

class Standard extends Parcel {
    Standard(double weight, double value) {
        super(weight, value);
    }

    double charge() {
        return 40 + 10 * weight;
    }
}

class Express extends Parcel implements Insurable {
    Express(double weight, double value) {
        super(weight, value);
    }

    double charge() {
        return 80 + 15 * weight;
    }

    public double insurance() {
        return value * 0.02;
    }

    double total() {
        return charge() + insurance();
    }
}

class Fragile extends Parcel implements Insurable {
    Fragile(double weight, double value) {
        super(weight, value);
    }

    double charge() {
        return 40 + 10 * weight + 50;
    }

    public double insurance() {
        return value * 0.02;
    }

    double total() {
        return charge() + insurance();
    }
}

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Parcel[] parcels = new Parcel[n];
        String[] types = new String[n];
        double grandTotal = 0;

        for (int i = 0; i < n; i++) {
            types[i] = sc.next();
            double weight = sc.nextDouble();
            double value = sc.nextDouble();

            switch (types[i]) {
                case "STANDARD":
                    parcels[i] = new Standard(weight, value);
                    break;
                case "EXPRESS":
                    parcels[i] = new Express(weight, value);
                    break;
                case "FRAGILE":
                    parcels[i] = new Fragile(weight, value);
                    break;
            }
        }

        for (int i = 0; i < n; i++) {
            double charge = parcels[i].charge();
            double insurance = 0;

            if (parcels[i] instanceof Insurable) {
                insurance = ((Insurable) parcels[i]).insurance();
            }

            double amount = parcels[i].total();

            System.out.printf(
                "%s: Charge=%.2f Insurance=%.2f Total=%.2f%n",
                types[i], charge, insurance, amount
            );

            grandTotal += amount;
        }

        System.out.printf("Grand Total: %.2f%n", grandTotal);
        sc.close();
    }
}
