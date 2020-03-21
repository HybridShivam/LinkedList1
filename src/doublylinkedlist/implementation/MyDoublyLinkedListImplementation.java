/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Jan-20
 *  Time: 2:59 AM
 */
package doublylinkedlist.implementation;

import doublylinkedlist.linkedlist.MyDoublyLinkedList;
import doublylinkedlist.node.Node;

public class MyDoublyLinkedListImplementation {
    public static void main(String[] args) {

        MyDoublyLinkedList linkedList = new MyDoublyLinkedList();

        deleteProcess(linkedList.deleteFromBeginning());
        deleteProcess(linkedList.deleteFromLast());

        linkedList.insertAtLast(100);
        linkedList.printList();
        linkedList.insertAtBeginning(567);
        linkedList.printList();
        linkedList.insertAtLast(400);
        linkedList.printList();
        linkedList.insertAtBeginning(780);
        linkedList.printList();
        deleteProcess(linkedList.deleteFromBeginning());
        linkedList.printList();
        deleteProcess(linkedList.deleteFromLast());
        //deleteProcess(linkedList.deleteFromLast().getPrevious());
        linkedList.printList();
    }

    public static void deleteProcess(Node deleted){
        if(deleted != null){
            System.out.println("deleted node =" + deleted.getData());
        }
        else{
            System.out.println("empty list");
        }
    }
}
