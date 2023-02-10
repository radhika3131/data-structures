package com.datastructures.linkedlists;
/*
This strategy considerably helps in deletion as you don’t need to keep track of the previous element while searching.
To see how effective this strategy is,
 let’s re-write the deleteByValue() operation for Doubly Linked List.
  We will use the same code which we implemented in the previous lesson and make additions to it

  Explanation: We will compare this code snippet with the one we created for SLL in the previous lessons and
  see which one is easier to implement.
  Initially, we check whether the list is empty or not; if it’s empty, we do nothing.

Next, we start traversing the elements.
If the value to be deleted is present at the start,
 all we have to do is call deleteAtHead(), which will make the headNode point to the nextNode pointer of the headNode,i.e.,
  it will make it point to the second element of the list. Not only that,
  but it will also have to update the prevNode pointer of the new headNode to point at null now.
 */
public class DoublyLinkedListDelete<T>{
    //Node inner class for DLL
    public class Node {
        public T data;
        public Node nextNode;
        public Node prevNode;
    }

    public Node headNode;
    public int size;

    public DoublyLinkedListDelete() {
        this.headNode = null;
    }

    //checks if the list is empty
    public boolean isEmpty() {
        if (headNode == null)
            return true; //is empty
        return false;    //is not empty
    }

    public void insertAtHead(T data) {
        //create node and put in the data
        Node newNode = new Node();
        newNode.data = data;
        // Make next of new node as head and previous as NULL
        newNode.nextNode = this.headNode;
        newNode.prevNode = null;
        //Change previous of head node to new node
        if (headNode != null)
            headNode.prevNode = newNode;
        this.headNode = newNode;
        size++;
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("List is Empty!");
            return;
        }

        Node temp = headNode;
        System.out.print("List : null <- ");

        while (temp.nextNode != null) {
            System.out.print(temp.data.toString() + " <-> ");
            temp = temp.nextNode;
        }

        System.out.println(temp.data.toString() + " -> null");
    }

    // Deletes the first element
    public void DeleteAtHead()
    {
        // if list is empty do nothing
        if(isEmpty())
            return;

        // if list is not empty then delete first element
        headNode = headNode.nextNode;
        headNode.prevNode = null;
        size--;
    }

    // Deletes by value
    public void deleteByValue(T data)
    {
        // if list is empty do nothing
        if(isEmpty())
            return;

        Node currentNode = this.headNode;
        if(currentNode.data.equals(data))
        {
            DeleteAtHead();
            return;
        }
        while (currentNode != null)
        {
            if(data.equals(currentNode.data)) {
                currentNode.prevNode.nextNode = currentNode.nextNode;

                if (currentNode.nextNode != null) {
                    currentNode.nextNode.prevNode = currentNode.prevNode;
                    size--;
                }
            }
        }
        currentNode = currentNode.nextNode;
    }

}
class Demo6
{
    public static void main(String[] args) {
        DoublyLinkedListDelete<Integer> dll = new DoublyLinkedListDelete<>();
        for (int i = 1; i <= 10; i++) {
            dll.insertAtHead(i);
        }
        System.out.print("Original ");
        dll.printList();
        System.out.print("After deleting 10 ");
        dll.deleteByValue(10);
        dll.printList();
        System.out.print("After deleting 1 ");
        dll.deleteByValue(1);
        dll.printList();
        System.out.print("After deleting 5 ");
        dll.deleteByValue(5);
        dll.printList();
    }
}
