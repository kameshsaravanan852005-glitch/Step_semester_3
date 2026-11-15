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

public class q2 {

    // Add student at the beginning
    static Node addFirst(Node head, String name) {
        Node newNode = new Node(name);

        newNode.next = head;
        head = newNode;

        return head;
    }

    // Add student at the end
    static Node addLast(Node head, String name) {
        Node newNode = new Node(name);

        if (head == null) {
            return newNode;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;

        return head;
    }

    // Print final line
    static void printLine(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = null;

        // Read starting line
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            head = addLast(head, name);
        }

        // Read operations
        int operations = sc.nextInt();

        for (int i = 0; i < operations; i++) {
            String operation = sc.next();
            String name = sc.next();

            if (operation.equals("addFirst")) {
                head = addFirst(head, name);
            } 
            else if (operation.equals("addLast")) {
                head = addLast(head, name);
            }
        }

        // Display final line
        printLine(head);

        sc.close();
    }
}


