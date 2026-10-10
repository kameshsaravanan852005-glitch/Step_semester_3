package main.java.week09hw;

import java.util.Scanner;

interface Saver {
    double reduceUnits(double units);
}

abstract class Appliance {
    double hours;

    Appliance(double hours) {
        this.hours = hours;
    }

    abstract double power();

    double units() {
        return power() * hours / 1000;
    }

    double cost() {
        return units() * 8;
    }
}

class Fridge extends Appliance {
    Fridge(double hours) {
        super(hours);
    }

    double power() {
        return 150;
    }
}

class AC extends Appliance implements Saver {
    AC(double hours) {
        super(hours);
    }

    double power() {
        return 1500;
    }

    public double reduceUnits(double units) {
        return units * 0.75;
    }
}

class TV extends Appliance {
    TV(double hours) {
        super(hours);
    }

    double power() {
        return 100;
    }
}

class Washer extends Appliance implements Saver {
    Washer(double hours) {
        super(hours);
    }

    double power() {
        return 500;
    }

    public double reduceUnits(double units) {
        return units * 0.75;
    }
}

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Appliance[] appliances = new Appliance[n];
        String[] types = new String[n];
        boolean[] saver = new boolean[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            types[i] = sc.next();
            double hours = sc.nextDouble();

            if (sc.hasNext("SAVER")) {
                sc.next();
                saver[i] = true;
            }

            switch (types[i]) {
                case "FRIDGE":
                    appliances[i] = new Fridge(hours);
                    break;
                case "AC":
                    appliances[i] = new AC(hours);
                    break;
                case "TV":
                    appliances[i] = new TV(hours);
                    break;
                case "WASHER":
                    appliances[i] = new Washer(hours);
                    break;
            }
        }

        for (int i = 0; i < n; i++) {
            if (saver[i] && !(appliances[i] instanceof Saver)) {
                System.out.println(
                    types[i] + ": saver mode not supported");
                continue;
            }

            double units = appliances[i].units();

            if (saver[i]) {
                units = ((Saver) appliances[i]).reduceUnits(units);
            }

            double cost = units * 8;
            System.out.printf(
                "%s: Units=%.2f Cost=%.2f%n",
                types[i], units, cost
            );

            total += cost;
        }

        System.out.printf("Total Cost: %.2f%n", total);
        sc.close();
    }
}

