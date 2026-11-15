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

public class q3 {

    // Find first position and number of copies
    static String find(Node head, String id) {
        Node current = head;

        int position = 0;
        int firstPosition = -1;
        int copies = 0;

        while (current != null) {
            position++;

            if (current.data.equals(id)) {
                copies++;

                if (firstPosition == -1) {
                    firstPosition = position;
                }
            }

            current = current.next;
        }

        if (copies == 0) {
            return id + " not found";
        }

        return id + " first at position " +
                firstPosition + ", copies: " + copies;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        // Create linked list
        for (int i = 0; i < n; i++) {
            String book = sc.next();

            Node newNode = new Node(book);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Book ID to search
        String id = sc.next();

        System.out.println(find(head, id));

        sc.close();
    }
}

// Time Complexity: O(n)
// Space Complexity of find(): O(1)
