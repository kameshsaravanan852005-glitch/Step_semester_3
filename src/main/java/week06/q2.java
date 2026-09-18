package main.java.week06;

class q2 {
    private double balance;

    q2(double balance) {
        this.balance = balance;
    }

    void topUp(double amount) {
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Invalid amount");
    }

    void deduct(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        q2 wallet = new q2(500);

        wallet.topUp(200);
        wallet.deduct(1000);

        System.out.println("Final balance: " + wallet.getBalance());
    }
}
