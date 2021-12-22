//Find the middle of a given linked list & Specific Node From The List

package SinglyLinkedListPrograms;

import java.util.Scanner;

class Nodee {
    int data;
    Nodee next;

    Nodee(int data) {
        this.data = data;
        this.next = null;
    }

}

public class Sample {
    Nodee head = null;

    public void insert() {
        int num;
        System.out.print("Enter Data: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        Nodee newNode = new Nodee(num);
        newNode.next = head;
        head = newNode;
    }
    public void traverse() {
        Nodee temp = head;
        if (head == null) {
            System.out.println("Linked List is Empty.");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public void midData(int count) {
        Nodee temp = head;

            for (int i = 0; i < (count / 2); i++) {
                temp = temp.next;
            }

        System.out.println("Middle Data: "+temp.data);
    }
    public void specNodeFromLast(int count, int n){
        Nodee temp = head;
        for(int i=0;i<(count-n); i++){
            temp = temp.next;
        }
        System.out.println(n+" th Element: "+temp.data);
    }

    public static void main(String[] args) {
        Sample objs = new Sample();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int count = 0;
        while (n == 0) {
            objs.insert();
            count++;
            System.out.println("Press '0' For Add Element or '1' For Exit");
            n = sc.nextInt();
            if (n == 1) {
                break;
            }
        }
        objs.traverse();
        System.out.println();
        objs.midData(count);
        System.out.println("Enter Position: ");
        int m = sc.nextInt();
        objs.specNodeFromLast(count,m);


    }
}
