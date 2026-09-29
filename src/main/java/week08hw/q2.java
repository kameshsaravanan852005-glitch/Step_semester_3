package main.java.week08hw;
import java.util.*;
import java.time.LocalDate;

abstract class LibraryItem {
    protected String title;
    protected LocalDate currentDate = LocalDate.of(2023, 10, 26);

    LibraryItem(String title) {
        this.title = title;
    }

    abstract LocalDate getDueDate();
}

class Book extends LibraryItem {
    Book(String title) {
        super(title);
    }

    LocalDate getDueDate() {
        return currentDate.plusDays(14);
    }
}

class DVD extends LibraryItem {
    DVD(String title) {
        super(title);
    }

    LocalDate getDueDate() {
        return currentDate.plusDays(7);
    }
}

class Magazine extends LibraryItem {
    Magazine(String title) {
        super(title);
    }

    LocalDate getDueDate() {
        return currentDate.plusDays(3);
    }
}

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();

            String[] parts = line.split(" ", 2);
            String type = parts[0];
            String title = parts[1].replace("\"", "");

            LibraryItem item;

            switch (type) {
                case "BOOK":
                    item = new Book(title);
                    break;
                case "DVD":
                    item = new DVD(title);
                    break;
                default:
                    item = new Magazine(title);
            }

            System.out.println(item.title + ": " + item.getDueDate());
        }
    }
}