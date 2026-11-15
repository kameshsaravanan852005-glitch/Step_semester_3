package main.java.week12;


import java.util.Scanner;

public class q3 {
    static String[] pile = new String[3];
    static int top = -1;

    static String[] queue = new String[3];
    static int front = 0;
    static int rear = -1;
    static int size = 0;

    static void returnBook(String book) {
        if (top == 2) {
            System.out.println(book +
                " rejected: pile is full");
        } else {
            pile[++top] = book;
            System.out.println(book + " placed on pile");
        }
    }

    static void shelveBook() {
        if (top == -1) {
            System.out.println("pile is empty");
        } else {
            System.out.println("shelved " + pile[top]);
            pile[top] = null;
            top--;
        }
    }

    static void waitStudent(String name) {
        if (size == 3) {
            System.out.println(name +
                " rejected: line is full");
        } else {
            rear = (rear + 1) % 3;
            queue[rear] = name;
            size++;

            System.out.println(name + " joined the line");
        }
    }

    static void serveStudent() {
        if (size == 0) {
            System.out.println("no one waiting");
        } else {
            System.out.println("served " + queue[front]);

            queue[front] = null;
            front = (front + 1) % 3;
            size--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String command = sc.next();

            if (command.equals("RETURN")) {
                String book = sc.next();
                book = book.replace(",", "");
                returnBook(book);
            }

            else if (command.equals("SHELVE")) {
                shelveBook();
            }

            else if (command.equals("WAIT")) {
                String name = sc.next();
                name = name.replace(",", "");
                waitStudent(name);
            }

            else if (command.equals("SERVE")) {
                serveStudent();
            }
        }

        sc.close();
    }
}

// Stack Operations: O(1)
// Queue Operations: O(1)