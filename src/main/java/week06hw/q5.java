package main.java.week06hw;
class q5 {
    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    q5(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {
        q5 e1 = new q5("Ravi", 50000);
        q5 e2 = new q5("Priya", 60000);
        q5 e3 = new q5("Arjun", 55000);

        q5.printCompanyInfo();
    }
}