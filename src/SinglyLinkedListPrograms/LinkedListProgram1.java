// Single Linked List
package SinglyLinkedListPrograms;

import java.util.Scanner;

class Nodes{
    int data;
    Nodes next;
    Nodes(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList1{
    Nodes head = null;
    public void add_begin(Nodes new_Nodes){
        new_Nodes.next = head;
        head = new_Nodes;
    }
    public void add_end(Nodes new_Nodes){
        Nodes temp1 = head;
        while (temp1.next != null) {
            temp1 = temp1.next;
        }
        temp1.next = new_Nodes;
    }
    public void add_pos(Nodes new_Nodes){
        int p;
        System.out.println("Enter Position Number: ");
        Scanner sc = new Scanner(System.in);
        p = sc.nextInt();
        if(p==0){
            System.out.println("Invalid Position!!");
        }
        else if(p==1){
            add_begin(new_Nodes);
        }
        else{
            Nodes temp2 = head;
            for (int i = 0; i < (p - 2); i++) {
                temp2 = temp2.next;
            }
            new_Nodes.next = temp2.next;
            temp2.next = new_Nodes;
        }

    }
    public void del_begin(){
        Nodes temp = head;
        temp = temp.next;
        head = temp;
    }
    public void del_end(){
        Nodes temp = head;
        Nodes ptr = temp.next;
        while (ptr.next!=null){
            temp = ptr;
            ptr = ptr.next;
        }
        temp.next = null;
    }
    public void del_pos(int p){
        Nodes temp = head;
        Nodes ptr = temp.next;
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
            Nodes new_Nodes = new Nodes(val);

            if(head==null){
                head= new_Nodes;
                flag=false;
            }
            else{
                if (num == 1) {
                    add_begin(new_Nodes);
                }
                else if(num==2){
                    add_end(new_Nodes);
                }
                else if(num==3){
                    add_pos(new_Nodes);
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
        Nodes temp = head;
        if (head == null) {
            System.out.println("Linked List is Empty.");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

}
public class LinkedListProgram1 {
    public static void main(String[] args) {
        LinkedListProgram1 obj = new LinkedListProgram1();
        LinkedList1 obj1 = new LinkedList1();
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
