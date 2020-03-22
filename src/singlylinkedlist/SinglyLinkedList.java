package singlylinkedlist;
//Single Class SinglyLinkedList
// Java program to print reverse of a linked list
class SinglyLinkedList
{
    Node head;  // head of list

    /* Linked list Node*/
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    /* Function to print reverse of linked list */
    void printReverse(Node head)
    {
        if (head == null) return;

        // print list of head node
        printReverse(head.next);

        // After everything else is printed
        System.out.print(head.data+" ");
    }

    /* Utility Functions */

    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /*Drier function to test the above methods*/
    public static void main(String args[])
    {
        // Let us create linked list 1->2->3->4
        SinglyLinkedList llist = new SinglyLinkedList();
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        llist.printReverse(llist.head);
    }
}