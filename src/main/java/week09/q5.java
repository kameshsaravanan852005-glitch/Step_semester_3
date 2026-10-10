package main.java.week09;


import java.util.Scanner;

abstract class Booking {
    double distance;
    static final double FEE = 50.0;

    Booking(double distance) {
        this.distance = distance;
    }

    abstract double fare();

    double total() {
        return fare() + FEE;
    }
}

class Bus extends Booking {
    Bus(double distance) {
        super(distance);
    }

    double fare() {
        return distance * 2.0;
    }
}

class Train extends Booking {
    Train(double distance) {
        super(distance);
    }

    double fare() {
        return distance * 1.5;
    }
}

class Flight extends Booking {
    Flight(double distance) {
        super(distance);
    }

    double fare() {
        return 2500 + distance * 4.0;
    }
}

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Booking[] bookings = new Booking[n];

        for (int i = 0; i < n; i++) {
            String mode = sc.next();
            double distance = sc.nextDouble();

            switch (mode) {
                case "BUS":
                    bookings[i] = new Bus(distance);
                    break;

                case "TRAIN":
                    bookings[i] = new Train(distance);
                    break;

                case "FLIGHT":
                    bookings[i] = new Flight(distance);
                    break;
            }
        }

        for (Booking b : bookings) {
            String mode = b instanceof Bus ? "BUS" :
                          b instanceof Train ? "TRAIN" : "FLIGHT";

            System.out.printf("%s: %.2f%n", mode, b.total());
        }

        sc.close();
    }
}

