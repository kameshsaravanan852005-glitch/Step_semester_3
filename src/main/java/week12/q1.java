package main.java.week12;


import java.util.Scanner;

class Staff {
    String name;
    double baseSalary;

    Staff(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double getBonus() {
        return 0;
    }

    String getType() {
        return "Staff";
    }

    double getTotal() {
        return baseSalary + getBonus();
    }

    void display() {
        System.out.println(name + " (" + getType() +
            "): base " + baseSalary +
            ", bonus " + getBonus() +
            ", total " + getTotal());
    }
}

class Teacher extends Staff {
    Teacher(String name, double salary) {
        super(name, salary);
    }

    double getBonus() {
        return 5000;
    }

    String getType() {
        return "Teacher";
    }
}

class LabAssistant extends Staff {
    LabAssistant(String name, double salary) {
        super(name, salary);
    }

    double getBonus() {
        return 2000;
    }

    String getType() {
        return "LabAssistant";
    }
}

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Staff[] arr = new Staff[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            double salary = sc.nextDouble();

            if (type.equals("Teacher")) {
                arr[i] = new Teacher(name, salary);
            } else if (type.equals("LabAssistant")) {
                arr[i] = new LabAssistant(name, salary);
            } else {
                arr[i] = new Staff(name, salary);
            }
        }

        double grandTotal = 0;

        for (int i = 0; i < n; i++) {
            arr[i].display();
            grandTotal += arr[i].getTotal();
        }

        System.out.println("Grand Total Salary: " + grandTotal);

        sc.close();
    }
}

// Time Complexity: O(n)
