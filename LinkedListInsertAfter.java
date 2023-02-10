package com.datastructures.linkedlists;

public class LinkedListInsertAfter<T> {
    public class Node
    {
        // inner class
        public T data ;
        public Node nextNode;// It is pointer which is going to store reference of the next node
    }
    public Node headNode;
    public int size;
    //constructor
    public LinkedListInsertAfter()
    {
        this.headNode = null;
        this.size = 0;
    }
    //Function to check if list is empty or not
    public boolean isEmpty()
    {
        if(headNode == null)
            return true;
        return false;
    }

    // insert at head
    public void inserAtHead(T data)
    {
        Node newNode = new Node();
        newNode.data = data;

        // Linking headNode to newNode's nextNode
        newNode.nextNode = headNode;
        headNode = newNode;
        size++;
    }

    //helper function for printing list
    public void printList()
    {
        if(isEmpty())
        {
            System.out.println("List is empty");
            return;
        }
        Node temp = headNode;
        System.out.println("List: ");
        while (temp.nextNode != null)
        {
            System.out.println(temp.data.toString() + "->");
            temp = temp.nextNode;
        }
        System.out.println(temp.data.toString() + "-> null");
    }
    //insert at end
    public void insertAtEnd(T data)
    {
        //if list is empty
        if(isEmpty())
        {
            inserAtHead(data);
            return ;
        }

        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = null;

        Node temp = headNode;
        while (temp.nextNode != null)
        {
            temp = temp.nextNode;
        }
        temp.nextNode = newNode;
        size++;
    }
    // insert after
    public void insertAfter(T data , T previous)
    {
        // creating a newnode and assigning data to this newnode
        Node newNode = new Node();
        newNode.data = data;

        Node currentNode = this.headNode;
        //traverse the list until node having data equal to previous is found
        while (currentNode != null && !currentNode.data.equals(previous))
        {
            currentNode = currentNode.nextNode;
        }
        // if such a node is found
        newNode.nextNode = currentNode.nextNode;
        currentNode.nextNode = newNode;
        size++;
    }

}
class Demo2
{
    public static void main(String[] args) {
        LinkedListInsertAfter sll = new LinkedListInsertAfter();
        sll.printList();
        for (int i = 1; i <= 6; i++) {
            sll.insertAtEnd(i); // inserting value at the tail of the list
        }
        sll.printList();

        System.out.println ("\nInserting 8 after 2");
        sll.insertAfter(8, 2);
        sll.printList();   // calling insert after
        System.out.println ("\nInserting 10 after 3");
        sll.insertAfter (10, 3);   // calling insert after
        sll.printList();
    }
}
