package main.java.week06hw;
class q4 {
    String studentName;
    int seatNumber;

    q4(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }

    public static void main(String[] args) {
        q4 priya = new q4("Priya", 0);

        q4 copy = priya;
        copy.seatNumber = 45;

        q4 separate = new q4("Priya", 45);

        System.out.println("Seat Number: " + priya.seatNumber);
        System.out.println("copy == priya: " + (copy == priya));
        System.out.println("separate == priya: " + (separate == priya));
    }
}
