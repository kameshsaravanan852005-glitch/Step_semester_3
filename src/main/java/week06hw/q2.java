package main.java.week06hw;

class q2 {
    private double basicSalary;
    private double bonus;

    q2(double basicSalary) {
        this.basicSalary = basicSalary;
        this.bonus = 0;
    }

    void creditBonus(double amount) {
        if (amount > 0) {
            bonus += amount;
        } else {
            System.out.println("Invalid bonus");
        }
    }

    void deductTax(double percent) {
        basicSalary -= basicSalary * percent / 100;
    }

    double getNetSalary() {
        return basicSalary + bonus;
    }

    public static void main(String[] args) {
        q2 account = new q2(50000);

        account.creditBonus(5000);
        account.deductTax(10);

        System.out.println("Net salary: Rs " + account.getNetSalary());
    }
}
