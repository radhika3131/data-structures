package com.datastructures.linkedlists;
/*
Problem Statement#
In the code snippet given below, you have to implement the void deleteByValue(T data) method. In this method, we will pass a particular value that we want to delete from the list. The node containing this value could be anywhere on the list. It is also possible that such a node may not exist at all.

Therefore, we would have to traverse the whole list until we find the value which needs to be deleted. If the value doesn’t exist, we simply return control to the calling function.

Note: This function removes only the first occurrence of the value from the list.

The Node and linkedList classes implemented in the previous lessons are available to you.

You have access to:

isEmpty()
printList()
deleteAtHead()
as member methods of the SinglyLinkedList class.

Method Prototype:#
void deleteByValue(T data)
Output:#
A linked list with the element removed.

Sample Input#
linkedlist = 3->2->1->0,
data = 1
Sample Output#
linkedlist = 3->2->0
 */
public class LinkedListDeleteAtValue<T> {
    public class Node
    {
        // inner class
        public T data ;
        public Node nextNode;// It is pointer which is going to store reference of the next node
    }
    public Node headNode;
    public int size;
    //constructor
    public LinkedListDeleteAtValue()
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
    public void insertAtHead(T data)
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
            insertAtHead(data);
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
    // delete data from the head
    //Time complexity is O(1)
    public void deleteAtHead()
    {
        if(isEmpty())
        {
            return;
        }

        //If a list is not empty, then the headNode points to the nextNode of the head.
        headNode = headNode.nextNode;
        size--;
    }
    // delete the data by value
    //Time Complexity#
    //In the worst case, you would have to traverse until the end of the list. This means the time complexity will be O(n).
    public void deleteByValue(T data)
    {
        // if list is empty
        if(isEmpty())
        {
            return;
        }

        Node currentNode = this.headNode;
        Node previous = null;// previous node start from null

        if(currentNode.data.equals(data))
        {
            //data is at head so delete from head
            deleteAtHead();
            return;
        }
        //traverse the list searching for the data to delete
        while (currentNode != null)
        {
            if(data.equals(currentNode.data))
            {
                //node to delete is found
                previous.nextNode = currentNode.nextNode;
                size--;
                return;
            }
            previous = currentNode;
            currentNode = currentNode.nextNode;

        }
    }
}
class Demo5 {
    public static void main(String[] args) {

        LinkedListDeleteAtValue sll = new LinkedListDeleteAtValue<>();
        for (int i = 1; i <= 10; i++) {
            sll.insertAtHead(i);
        }
        System.out.println("Originial :");
        sll.printList();
        System.out.println("After deleting 10 from List: ");
        sll.deleteByValue(10);
        sll.printList();
        System.out.println("After deleting 9 from List: ");
        sll.deleteByValue(9);
        sll.printList();
        System.out.println("After deleting 1 from List: ");
        sll.deleteByValue(1);
        sll.printList();
        System.out.println("After deleting 21 from List: ");
        sll.deleteByValue(21);
        sll.printList(); // list remains unchanged as there is no element 21 in the list
    }
}
