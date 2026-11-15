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

public class q4 {

    // Remove first occurrence of booking
    static Node removeFirst(Node head, String booking) {

        // If list is empty
        if (head == null) {
            System.out.println(booking + " not found");
            return head;
        }

        // If booking is at the head
        if (head.data.equals(booking)) {
            return head.next;
        }

        Node current = head;

        // Search for the node before the booking
        while (current.next != null &&
               !current.next.data.equals(booking)) {

            current = current.next;
        }

        // If booking is not found
        if (current.next == null) {
            System.out.println(booking + " not found");
        } else {
            // Remove the booking node
            current.next = current.next.next;
        }

        return head;
    }

    // Print linked list
    static void printList(Node head) {
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

        Node head = null;
        Node tail = null;

        // Create linked list
        for (int i = 0; i < n; i++) {
            String booking = sc.next();

            Node newNode = new Node(booking);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Booking to cancel
        String booking = sc.next();

        head = removeFirst(head, booking);

        // Print result
        printList(head);

        sc.close();
    }
}
