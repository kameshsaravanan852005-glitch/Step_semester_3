package main.java.week08;

import java.util.*;
import java.time.LocalDate;

abstract class Plan {
    protected String name;
    protected LocalDate startDate;

    Plan(String name, LocalDate startDate) {
        this.name = name;
        this.startDate = startDate;
    }

    abstract LocalDate getRenewalDate();
}

class Basic extends Plan {
    Basic(String name, LocalDate startDate) {
        super(name, startDate);
    }

    LocalDate getRenewalDate() {
        return startDate.plusDays(30);
    }
}

class Standard extends Plan {
    Standard(String name, LocalDate startDate) {
        super(name, startDate);
    }

    LocalDate getRenewalDate() {
        return startDate.plusDays(90);
    }
}

class Premium extends Plan {
    Premium(String name, LocalDate startDate) {
        super(name, startDate);
    }

    LocalDate getRenewalDate() {
        return startDate.plusDays(365);
    }
}

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            LocalDate date = LocalDate.parse(sc.next());

            Plan plan;

            switch (type) {
                case "BASIC":
                    plan = new Basic(name, date);
                    break;

                case "STANDARD":
                    plan = new Standard(name, date);
                    break;

                default:
                    plan = new Premium(name, date);
            }

            System.out.println(plan.name + ": " + plan.getRenewalDate());
        }
    }
}
