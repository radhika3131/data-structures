package com.datastructures.linkedlists;
/*
Inserion at the head
 */
public class SinglyLinkedList<T>
{
    // Node inner class
    public class Node
    {
        public T data;
        public Node nextNode;// It is pointer which is going to store reference of the next node
    }

    public Node headNode;//head node of the linked list
    public int size;

    public SinglyLinkedList() {
        this.headNode = null;
        this.size = 0;
    }

    // function to check if list is empty or not
    public boolean isEmpty()
    {
        if(headNode == null)
            return true;
        return false;
    }

    // Insert new data at the start of the list
    public void insertAtHead(T data)
    {
        // Creating new node
        Node newNode = new Node();
        newNode.data = data;

        // Linking headNode to newNode's nextNode
        newNode.nextNode = headNode;
        headNode = newNode;
        size++;
    }

    public void printList()
    {
        if (isEmpty()) {
            System.out.println("List is Empty!");
            return;
        }

        Node temp = headNode;
        System.out.print("List : ");
        while(temp.nextNode != null);
        {
            System.out.println(temp.data.toString()+ " -> ");
            temp = temp.nextNode;
        }
        System.out.println(temp.data.toString() + " -> null");
    }
}
class Demo
{
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList<>();
        list.printList();
        for (int i = 0 ; i<=10 ; i++)
        {
            list.insertAtHead(i);
            list.printList();
        }
    }
}




















































































