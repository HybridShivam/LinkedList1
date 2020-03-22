/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 30-Jan-20
 *  Time: 4:10 PM
 */
package singlylinkedlist.implementation;

import singlylinkedlist.linkedlist.MyLinkedList;
import singlylinkedlist.node.Node;

public class MyLinkedListImplementtation {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        deleteForMe(linkedList.deleteFromBeginning());


        linkedList.insertAtLast(200);
        linkedList.insertAtLast(100);
        linkedList.printList();

        linkedList.insertAtBeginning(5000);
        linkedList.insertAtBeginning(300);
        linkedList.printList();

        System.out.println("Printing Reverse List Using Recursion");
        linkedList.printReverseList(linkedList.getHead());
        System.out.println();
        deleteForMe(linkedList.deleteFromBeginning());
        linkedList.printList();
        deleteForMe(linkedList.deleteFromLast());
        linkedList.printList();

    }

    // iski koi jarurat nahi hai
    public static void deleteForMe(Node deletedNode){
        if(deletedNode != null){
            System.out.println("deleted data =" + deletedNode.getData());
        }
        else{
            System.out.println("empty list");
        }
    }


}
