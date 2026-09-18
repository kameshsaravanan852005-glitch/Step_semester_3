package main.java.week06hw;
class q1 {
    String title;
    String author;
    int copiesAvailable;

    q1(String title, String author, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    void printEntry() {
        System.out.println(title + " by " + author + " - "
                + copiesAvailable + " copies available");
    }

    public static void main(String[] args) {
        q1[] books = {
            new q1("Clean Code", "Robert C. Martin", 3),
            new q1("Effective Java", "Joshua Bloch", 5),
            new q1("Refactoring", "Martin Fowler", 0),
            new q1("Design Patterns", "GoF", 2)
        };

        for (q1 book : books) {
            book.printEntry();
        }
    }
}

    

