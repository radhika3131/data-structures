package com.datastructures.linkedlists;
/*
Problem Statement#
If you know how to insert an element in a list, then searching for an item will not be that difficult for you. Now, based on the steps mentioned above, we have designed a simple coding exercise for your practice. There is a solution placed in the solution section for your help, but try to solve it on your own first.

Method Prototype#
boolean searchNode(T data)
Output#
It returns true or false to show if a certain value does or does not exists in the list.

Sample Input#
linkedlist = 5->90->10->4   and  value = 4
Sample Output#
true
 */
public class LinkedListSearch<T> {
    public class Node
    {
        // inner class
        public T data ;
        public Node nextNode;// It is pointer which is going to store reference of the next node
    }
    public Node headNode;
    public int size;
    //constructor
    public LinkedListSearch()
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
    // search element in the list
    //Time Complexity#
    //The time complexity for this algorithm is O(n) because we have to traverse through the list.
    public boolean search(T data)
    {
        if(isEmpty())
        {
            System.out.println("List is empty!");
        }
        Node temp = headNode;
        while(temp!= null)
        {
          if (temp.data.equals(data))
            return true;

        temp = temp.nextNode;

        }
        return false;
    }
}
class Demo3
{
    public static void main(String[] args) {
        LinkedListSearch list = new LinkedListSearch<>();
        for(int i =0 ; i<=10 ; i++)
        {
            list.insertAtEnd(i);
        }
        if(list.search(3)) {   // Calling search function
            System.out.println("Value: 3 is Found");
        }
        else {
            System.out.println("Value: 3 is not Found");
        }

        if(list.search(15)) {   // Calling search function
            System.out.println("Value: 15 is Found");
        }
        else {
            System.out.println("Value: 15 is not Found");
        }
    }
}



