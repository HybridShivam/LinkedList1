/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Jan-20
 *  Time: 2:41 AM
 */
package doublylinkedlist.linkedlist;

import doublylinkedlist.node.Node;

public class MyDoublyLinkedList {
    // to efer start of list
    private Node head;

    // constructor to initialize linked list at beginning head is null
    public MyDoublyLinkedList() {
        head = null;
    }

    //insert at beginning
    public void insertAtBeginning(int data){
        // creating node
        Node node = new Node(data);
        // checking if head is null
        // then head will refer node
        if(head == null) {
            node.setNext(head);
            head = node;
        }
        //if there some node then we will add the given node before that any node
        else{
            head.setPrevious(node);
            node.setNext(head);
            head = node;
        }
    }
    // insert at last
    public void insertAtLast(int data){
        // creating node
        Node node = new Node(data);
        // checking if head is null
        // then head will refer node
        if(head == null){
            head = node;
        }
        // else we will travers the list till end
        else{
            // assigning head to temp, to traverse the list
            Node temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            //
            node.setPrevious(temp);
            temp.setNext(node);
        }
    }

    public Node deleteFromBeginning(){
        Node response = null;
        if(head != null){
            response = head;
            head = head.getNext();
            head.setPrevious(null);
        }

        return response;
    }

    public Node deleteFromLast(){
        Node response = null;
        if(head != null){
            Node temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            if(temp.getPrevious() != null){
                response = temp;
                temp = temp.getPrevious();
                response.setPrevious(null);
                temp.setNext(null);


            }
            else{
                response = head;
                head = null;
            }
        }

        return response;
    }

    public  void printList(){
        System.out.println("printing list");
        Node temp = head;
        while(temp != null){
            System.out.print(temp.getData());
            temp = temp.getNext();
            if(temp != null){
                System.out.print("<--->");
            }
        }
        System.out.println();
    }

}
