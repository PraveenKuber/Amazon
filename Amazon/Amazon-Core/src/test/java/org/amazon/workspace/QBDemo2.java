package org.amazon.workspace;

public class QBDemo2 {
    /*
    * Reverse a singly linked list in groups of given size.
     Input: 1->2->3->4->5->6->7->8->NULL, K = 3
     Output: 3->2->1->6->5->4->8->7->NULL

    Input: 1->2->3->4->5->6->7->8->NULL, K = 5
    Output: 5->4->3->2->1->8->7->6->NULL
    *
    * */
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head;
    Node next;
    Node prev;

    public void add(int data){
        Node new_node=new Node(data);
        Node current=head;
        if(current==null){
            current=new_node;
            current.next=new_node;
            System.out.println("Current :::"+current.data);
            //current=new_node;
        }/*else{
            current.next=new_node;
            current=new_node;
        }*/
        //head=current;
    }

    public void display(){
        Node current=head;
        System.out.printf("Node :::::::"+current);
        while(current!=null){
            System.out.printf("Data is :::"+current.data);
            current=current.next;
        }
    }

    public static void main(String[] args) {
        QBDemo2 qbDemo2 = new QBDemo2();
        qbDemo2.add(10);
        qbDemo2.add(20);
        qbDemo2.add(30);
        qbDemo2.add(40);

        qbDemo2.display();
    }


}
