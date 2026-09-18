package main.java.week06;

class q4 {
    String name;
    int booksIssued;

    q4(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }

    public static void main(String[] args) {
        q4 ravi = new q4("Ravi", 0);

        q4 duplicate = ravi;
        duplicate.booksIssued = 3;

        q4 separate = new q4("Ravi", 3);

        System.out.println("Books issued: " + ravi.booksIssued);
        System.out.println("duplicate == ravi: " + (duplicate == ravi));
        System.out.println("separate == ravi: " + (separate == ravi));
    }
}