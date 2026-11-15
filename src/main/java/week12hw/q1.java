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

public class q1 {

    // Build linked list
    static Node build(String[] stops) {
        Node head = null;
        Node tail = null;

        for (int i = 0; i < stops.length; i++) {
            Node newNode = new Node(stops[i]);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }

    // Print linked list
    static void printRoute(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] stops = new String[n];

        for (int i = 0; i < n; i++) {
            stops[i] = sc.next();
        }

        Node head = build(stops);

        // Print route
        printRoute(head);

        // Count stops and find first and last
        int count = 0;
        Node current = head;
        String first = head.data;
        String last = head.data;

        while (current != null) {
            count++;
            last = current.data;
            current = current.next;
        }

        System.out.println("Stops: " + count +
                ", First: " + first +
                ", Last: " + last);

        sc.close();
    }
}

// Time Complexity:
// Building: O(n)
// Printing: O(n)
// Finding count, first and last: O(n)
//
// Space Complexity: O(n)