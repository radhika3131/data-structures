package com.datastructures.linkedlists;
/*
Problem Statement#
Here’s a small coding exercise made for your practice. In the code snippet provided below, you will complete the void insertAtEnd(T data) method. This will take a generic type T value called data and insert that value at the end of the list. This code would be the part of the SinglyLinkedList class that we created in the previous lesson, therefore, any private members of that class can be accessed inside the function as well. After writing the code, run it and see how many tests you passed.

Method Prototype#
void insertAtEnd(T data)
Output#
The return type of the method is void. The object on which it is called will be modified only.

Sample Input#
linkedlist = 0->1->2
data = 3
Sample Output#
linkedlist = 0->1->2->3
 */
public class LinkedListInsertAtEnd<T> {
    // inner class
    public class Node {
        public T data;
        public Node nextNode;
    }

    public Node headNode;//headnode of the linked list
    public int size;

    public LinkedListInsertAtEnd() {
        this.headNode = null;
        this.size = 0;
    }

    // Helper Function that checks if List is empty or not
    public boolean isEmpty() {
        if (headNode == null)
            return true;
        return false;
    }

    // Inserts new data at the start of the linked list
    public void insertAtHead(T data) {
        //Creating a new node and assigning it the new data value
        Node newNode = new Node();
        newNode.data = data;

        //Linking head to the newNode's nextNode
        newNode.nextNode = headNode;
        headNode = newNode;
        size++;
    }

    // Helper Function to printList
    public void printList() {
        if(isEmpty())
        {
            System.out.println("List is empty!");
            return;
        }
        Node temp = headNode;
        System.out.println("List:");
        while (temp.nextNode != null) {
            System.out.println(temp.data.toString() + " -> ");
            temp = temp.nextNode;
        }
        System.out.println(temp.data.toString() + " -> null ");
    }
    // Inserts new data at the end of the linked list
    //Time Complexity#
    //This algorithm traverses the entire linked list, and hence, works in O(n) time.

    public void insertAtEnd(T data) {
        //if the list is empty then call insertATHead()
        if (isEmpty()) {
            insertAtHead(data);
            return;
        }
        Node newNode = new Node();
        newNode.data = data;

        newNode.nextNode = null;
        // iterate till the last element
        Node temp = headNode;
        while (temp.nextNode != null) {
            temp = temp.nextNode;
        }
        temp.nextNode = newNode;
        size++;

    }

}
class Demo1 {
    public static void main(String args[]) {
        LinkedListInsertAtEnd<Integer> sll = new LinkedListInsertAtEnd<>();
        sll.printList();
        for (int i = 1; i <= 10; i++) {
            sll.insertAtEnd(i);
            sll.printList();
        }

    }
}


