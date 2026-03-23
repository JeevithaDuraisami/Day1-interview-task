// BLOCK 5 – DATA STRUCTURES & ALGORITHMS

// Topic: Linked List Basics

// Problem – Reverse a Linked List

// Example:
// 1 -> 2 -> 3 -> 4 -> 5
// Output:
// 5 -> 4 -> 3 -> 2 -> 1

// Time Complexity: O(n)

import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class ReverseLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        Node temp = null;
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
        }
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        Node t = head;
        while (t != null) {
            System.out.print(t.data+" ");
            t = t.next;
        }
    }
}

