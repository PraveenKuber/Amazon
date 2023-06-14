package org.amazon.workspace;

import sun.awt.image.ImageWatched;

public class LinkedListImplementation {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }

    public static LinkedListImplementation add(LinkedListImplementation list,int data){
        Node newNode = new Node(data);

        //check list is empty and insert begninng

        if(list.head==null){
            list.head=newNode;
        }else{
            //Traverse to the end and insert the node
            //Last node address
            Node lastNode = list.head;
            //Traverse
            while(lastNode.next!=null){
                lastNode=lastNode.next;
            }

            lastNode.next=newNode;
        }
        return list;
    }

    //Print

    public static void printList(LinkedListImplementation list){
        Node currentNode = list.head;
        while(currentNode != null ){
            System.out.println("Data is ::"+currentNode.data);
            currentNode=currentNode.next;
        }
    }

    public static void main(String[] args) {
      LinkedListImplementation linkedListImplementation = new LinkedListImplementation();
      linkedListImplementation = add(linkedListImplementation,10);
      linkedListImplementation = add(linkedListImplementation,20);
      linkedListImplementation = add(linkedListImplementation,30);
      linkedListImplementation = add(linkedListImplementation,40);
      linkedListImplementation = add(linkedListImplementation,50);
      printList(linkedListImplementation);

    }




    


}
