package StackUsingLinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
       this.data=data;
       this.next=null;
    }
}
class Stack {
    Node top = null;
    void push(int data){
        Node newNode = new Node(data);
        if(top==null){
            top=newNode;
        }
        else{
            newNode.next=top;
            top=newNode;
        }
        System.out.println("Inserted Successfully...");
    }
    void pop(){
        if(top==null){
            System.out.println("Sorry!! Stack Is Empty...");
        }
        else {
            int del_val=top.data;
            top=top.next;
            System.out.println(del_val+ "Deleted Successfully...");
        }
    }
    void peek(){
        if(top==null){
            System.out.println("Sorry!! Stack Is Empty...");
        }
        else {
            int top_value=top.data;
            System.out.println("Peek Value: "+top_value);
        }
    }
    void display(){
        if(top==null){
            System.out.println("Sorry!! Stack Is Empty...");
        }
        else {
            Node temp = top;
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
}
