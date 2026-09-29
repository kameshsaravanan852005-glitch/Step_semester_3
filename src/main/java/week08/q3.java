package main.java.week08;

import java.util.*;

abstract class Room {
    protected int units;

    Room(int units) {
        this.units = units;
    }

    abstract double getBill();

    abstract String getType();
}

class SingleRoom extends Room {
    SingleRoom(int units) {
        super(units);
    }

    double getBill() {
        return units * 8;
    }

    String getType() {
        return "SINGLE";
    }
}

class SharedRoom extends Room {
    private int occupants;

    SharedRoom(int units, int occupants) {
        super(units);
        this.occupants = occupants;
    }

    double getBill() {
        return (units * 6) / occupants;
    }

    String getType() {
        return "SHARED";
    }
}

class ACRoom extends Room {
    ACRoom(int units) {
        super(units);
    }

    double getBill() {
        return units * 10 + 200;
    }

    String getType() {
        return "AC";
    }
}

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int units = sc.nextInt();

            Room room;

            switch (type) {
                case "SINGLE":
                    room = new SingleRoom(units);
                    break;

                case "SHARED":
                    int occupants = sc.nextInt();
                    room = new SharedRoom(units, occupants);
                    break;

                default:
                    room = new ACRoom(units);
            }

            double bill = room.getBill();
            total += bill;

            System.out.printf("%s: %.2f%n", room.getType(), bill);
        }

        System.out.printf("Total: %.2f%n", total);
    }
}