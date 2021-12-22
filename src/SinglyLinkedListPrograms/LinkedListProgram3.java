// Circular Linked List
package SinglyLinkedListPrograms;
import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head = null;
    Node tail = null;
    public void add_begin(Node newNode){
        newNode.next = head;
        head = newNode;
        tail.next=head;
    }
    public void add_end(Node newNode){
        tail.next = newNode;
        tail = newNode;
        newNode.next=head;
    }
    public void add_pos(Node newNode){
        int p;
        System.out.println("Enter Position Number: ");
        Scanner sc = new Scanner(System.in);
        p = sc.nextInt();
        if(p==0){
            System.out.println("Invalid Position!!");
        }
        else if(p==1){
            add_begin(newNode);
        }
        else{
            Node temp2 = head;
            for (int i = 0; i < (p - 2); i++) {
                temp2 = temp2.next;
            }
            newNode.next = temp2.next;
            temp2.next = newNode;
        }

    }
    public void del_begin(){
        if(head==head.next){
            head=null;
        }
        else{
            head = head.next;
            tail.next=head;
        }

    }
    public void del_end(){
        Node temp = head;
        Node ptr = temp.next;
        while (ptr.next!=head){
            temp = ptr;
            ptr = ptr.next;
        }
        temp.next = head;
        tail = temp;
    }
    public void del_pos(int p){
        Node temp = head;
        Node ptr = temp.next;
        for(int i =0; i<p-2; i++){
            temp = ptr;
            ptr = temp.next;
        }
        temp.next = ptr.next;
    }
    public int repeation() {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Do You Want To Add Another Element?");
        System.out.println("Press '0' For Yes or '1' For No");
        x = sc.nextInt();
        return x;
    }
    public int repeation1() {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Do You Want To Delete Another Element?");
        System.out.println("Press '0' For Yes or '1' For No");
        x = sc.nextInt();
        return x;
    }
    public int disp() {
        if (head != null) {
            System.out.print("Add Begin: '1'");
            System.out.print("Add End: '2'");
            System.out.println("Add Pos: '3'");
        }
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }
    public int disp1() {
        if (head != null) {
            System.out.print("Del Begin: '7'");
            System.out.print("Del End: '8'");
            System.out.println("Del Pos: '9'");
        }
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }

    public void insertion(){
        int num=0,n=0;
        boolean flag=true;

        while (n==0){
            if (flag == false) {
                num = disp();
            }
            System.out.print("Enter Data: ");
            Scanner sc = new Scanner(System.in);
            int val = sc.nextInt();
            Node newNode = new Node(val);

            if(head==null){
                head= newNode;
                tail = newNode;
                newNode.next=head;

                flag=false;
            }
            else{
                if (num == 1) {
                    add_begin(newNode);
                }
                else if(num==2){
                    add_end(newNode);
                }
                else if(num==3){
                    add_pos(newNode);
                }
                else {
                    break;
                }

            }
            System.out.print("Current Elements In Linked List: ");
            traverse();
            System.out.println();
            n = repeation();
        }


    }
    public void deletion(){
        int num=0,n=0;
        boolean flag=true;

        while (n==0){
            num = disp1();
            if(head==null){
                System.out.println("Linked List Is Empty!!");
            }
            else{
                if (num == 7) {
                    del_begin();
                }
                else if(num==8){
                    del_end();
                }
                else if(num==9){
                    System.out.println("Enter Position Number: ");
                    Scanner sc = new Scanner(System.in);
                    int p = sc.nextInt();
                    if(p==0){
                        System.out.println();
                    }
                    else if(p==1){
                        del_begin();
                    }
                    else {
                        del_pos(p);
                    }

                }
                else {
                    break;
                }

            }
            System.out.print("Current Elements In Linked List: ");
            traverse();
            System.out.println();
            n = repeation1();
        }
    }
    public void traverse() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List is Empty.");
        } else {
            do{
                System.out.print(temp.data + " ");
                temp = temp.next;
            }while (temp != head);
        }
    }

}
public class LinkedListProgram3 {
    public static void main(String[] args) {
        LinkedListProgram3 obj = new LinkedListProgram3();
        LinkedList obj1 = new LinkedList();
        obj1.insertion();
        System.out.println("Are You Interested To Perform Delete Operation? Press '0' For Yes or '1' For No");
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        if(v==0){
            obj1.deletion();
        }
        obj1.traverse();

    }
}
