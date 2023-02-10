package com.datastructures.linkedlists;
/*
Implementation of Doubly Linked List with Tail
In the code below, we have used a member variable called tailNode, which will point to the last node of the list.
Initially, it will be equal to null.
Impact on Insertion#
1) insertAtHead()#
Insertion at head remains almost the same as in DLL without tail.
The only difference is that if the element is inserted in an already empty linked list then, we have to update the tailNode as well.

2) insertAtEnd()#
Insertion at the end is a linear operation in DLL without tail. However, in DLL with tail, it becomes a constant operation.
 We simply insert the new node as the nextNode of the tailNode and then update the tailNode to point to the new node, after insertion.
 */
public class DoublyLinkedListInsertWithTail<T> {
    // Node inner class for DDL
    public class Node {
        public T data;
        public Node nextNode;
        public Node prevNode;
    }

    // member variables
    public Node headNode;
    public Node tailNode;//a tail is used as the pointer to the last node of the list.
    public int size;

    public DoublyLinkedListInsertWithTail() {
        this.headNode = null;
        this.tailNode = null;
        this.size = 0;
    }
    //returns true if list is empty
    public boolean isEmpty() {
        if (headNode == null && tailNode == null) //checking tailNode to make sure
            return true;
        return false;
    }
    // getter for headNode
    public Node getHeadNode() {
        return headNode;
    }

    //getter for tailNode;
    public Node getTailNode() {
        return tailNode;
    }

    //getter for size
    public int getSize() {
        return size;
    }

    public void printList()
    {
        if(isEmpty())
        {
            System.out.println("List is Empty!");
            return;
        }
        Node temp = this.headNode;
        System.out.println("List : null");
        while (temp.nextNode != null)
        {
            System.out.println(temp.data.toString() + "<->");
            temp = temp.nextNode;
        }
        System.out.println(temp.data.toString() + " -> null ");

    }
    //insert at start of the list
    public void insertAtHead(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = this.headNode; //Linking newNode to head's nextNode
        newNode.prevNode = null; //it will be inserted at start so prevNode will be null
        if (!isEmpty())
            headNode.prevNode = newNode;
        else
            tailNode = newNode;
        this.headNode = newNode;
        size++;
    }
    // insert at the end of the list
    public void insertAtEnd(T data)
    {
        if(isEmpty())
        {
            insertAtHead(data);
            return;
        }
        // make a newNode
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = null;
        newNode.prevNode = tailNode;
        tailNode.nextNode = newNode;
        tailNode = newNode;
        size++;
    }
}
class Demo7
{
    public static void main(String[] args) {
        DoublyLinkedListInsertWithTail<Integer> list = new DoublyLinkedListInsertWithTail<>();
        for (int i = 0; i <= 3; i++) {
            list.insertAtHead(i); //inserting 0 to 3 at start
        }
        System.out.println("After inserting 0 to 3 at start :");
        list.printList();
        for (int i = 5; i <= 10; i++) {
            list.insertAtEnd(i); //inserting 5 to 10 at end
        }
        System.out.println("\n After inserting 5 to 10 at end :");
        list.printList();
    }
}

