package main.java.week12hw;


import java.util.Scanner;

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class q5 {

    static Node top = null;
    static int size = 0;

    // Push operation
    static void push(String plate) {
        Node newNode = new Node(plate);

        newNode.next = top;
        top = newNode;
        size++;

        System.out.println("push " + plate +
                " -> top " + top.data +
                ", size " + size);
    }

    // Pop operation
    static void pop() {
        if (isEmpty()) {
            System.out.println("pop -> stack is empty");
            return;
        }

        String plate = top.data;

        top = top.next;
        size--;

        System.out.println("pop -> " + plate +
                ", size " + size);
    }

    // Peek operation
    static void peek() {
        if (isEmpty()) {
            System.out.println("peek -> stack is empty");
        } else {
            System.out.println("peek -> " + top.data);
        }
    }

    // Check whether stack is empty
    static boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String operation = sc.next();

            if (operation.equals("push")) {
                String plate = sc.next();
                plate = plate.replace("(", "")
                             .replace(")", "")
                             .replace(",", "");

                push(plate);
            }

            else if (operation.equals("pop")) {
                pop();
            }

            else if (operation.equals("peek")) {
                peek();
            }

            else if (operation.equals("isEmpty")) {
                System.out.println("isEmpty -> " + isEmpty());
            }
        }

        sc.close();
    }
}