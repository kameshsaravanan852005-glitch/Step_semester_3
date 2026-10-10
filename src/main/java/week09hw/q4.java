package main.java.week09hw;

import java.util.Scanner;

interface NightService {
    double nightFare(double fare);
}

abstract class Cab {
    double km;
    static final double MIN_FARE = 100;

    Cab(double km) {
        this.km = km;
    }

    abstract double rate();

    double fare() {
        return Math.max(km * rate(), MIN_FARE);
    }
}

class Mini extends Cab {
    Mini(double km) {
        super(km);
    }

    double rate() {
        return 10;
    }
}

class Sedan extends Cab implements NightService {
    Sedan(double km) {
        super(km);
    }

    double rate() {
        return 14;
    }

    public double nightFare(double fare) {
        return fare * 1.2;
    }
}

class SUV extends Cab implements NightService {
    SUV(double km) {
        super(km);
    }

    double rate() {
        return 18;
    }

    public double nightFare(double fare) {
        return fare * 1.2;
    }
}

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Cab[] cabs = new Cab[n];
        String[] types = new String[n];
        String[] times = new String[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            types[i] = sc.next();
            double km = sc.nextDouble();
            times[i] = sc.next();

            switch (types[i]) {
                case "MINI":
                    cabs[i] = new Mini(km);
                    break;
                case "SEDAN":
                    cabs[i] = new Sedan(km);
                    break;
                case "SUV":
                    cabs[i] = new SUV(km);
                    break;
            }
        }

        for (int i = 0; i < n; i++) {
            if (times[i].equals("NIGHT")
                    && !(cabs[i] instanceof NightService)) {
                System.out.println(
                    types[i] + ": night service not available");
                continue;
            }

            double amount = cabs[i].fare();

            if (times[i].equals("NIGHT")) {
                amount = ((NightService) cabs[i]).nightFare(amount);
            }

            System.out.printf("%s: %.2f%n", types[i], amount);
            total += amount;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}

