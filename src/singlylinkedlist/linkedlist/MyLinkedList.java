/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 30-Jan-20
 *  Time: 4:01 PM
 */
package singlylinkedlist.linkedlist;

import singlylinkedlist.node.Node;

public class MyLinkedList {
    Node head;

    public MyLinkedList() {
        head = null;
    }

    public Node getHead() {
        return head;
    }

    //insert at last
    public void insertAtLast(int data){
        Node node = new Node(data);

        if(head == null){
            head = node;
        }
        else{
            Node temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(node);
        }

    }
    //traverse
    public void printList(){
        System.out.println("printing list...");
        Node temp = head;
        while(temp != null){
            System.out.print(temp.getData());
            temp = temp.getNext();
            if(temp != null){
                System.out.print("--->");
            }
        }
        System.out.println();
    }

    //insert at beginning
    public void insertAtBeginning(int data){
        Node node = new Node(data);
        node.setNext(head);
        head = node;
    }

    // delete form beginning
    public Node deleteFromBeginning(){
        Node response = null;
        response = head;
        if(head != null) {
            head = head.getNext();
        }
        return response;
    }
    //deletefrom last
    public Node deleteFromLast(){
        Node response = null;
        if(head != null){
            Node temp = head;
            Node previous = null;
            while(temp.getNext() != null){
                previous = temp;
                temp = temp.getNext();
            }
            if(previous != null){
                response = previous.getNext();
                previous.setNext(null);
            }
            else{
                response = head;
                head = null;
            }
        }
        return response;
    }
    //Recursive
    public void printReverseList(Node temp){
        if(temp!=null){
            //temp=temp.getNext();
            printReverseList(temp.getNext());
            //if(temp!=null)
            System.out.print(temp.getData()+"    ");
        }
    }

}
