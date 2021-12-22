package DoublyLinkedList;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int val, m, opt = 1;
        boolean flag = true;
        while (n == 0) {
            if (flag == false) {
                System.out.println("First: 1 | Last: 2 | Pos: 3");
                opt = sc.nextInt();
            }
            System.out.print("Enter Data: ");
            val = sc.nextInt();
            switch (opt) {
                case 1:
                    obj.insertFirst(val);
                    break;
                case 2:
                    obj.insertLast(val);
                    break;
                case 3:
                    System.out.println("Enter Position: ");
                    m = sc.nextInt();
                    obj.insertAtPos(val, m);
                default:
                    System.out.println("Invalid Option");
            }
            flag = false;
            System.out.print("Current Linked List: ");
            obj.forwardTraverse();
            System.out.println();
            System.out.println("Do You Want To Add Another Element? Press '0' For Yes or '1' For No");
            n = sc.nextInt();
        }
        System.out.print("Press '9' For Delete Operation or Press '5' To Exit : ");
        int v = sc.nextInt();
        if(v==9){
            int q=0;
            while (q == 0) {
                System.out.println("First: 1 | Last: 2 | Pos: 3");
                opt = sc.nextInt();
                switch (opt) {
                    case 1:
                        obj.deleteFirst();
                        break;
                    case 2:
                        obj.deleteLast();
                        break;
                    case 3:
                        System.out.println("Enter Position: ");
                        m = sc.nextInt();
                        obj.deleteAtPos(m);
                    default:
                        System.out.println("Invalid Option");
                }
                System.out.print("Current Linked List: ");
                obj.forwardTraverse();
                System.out.println();
                System.out.println("Do You Want To Delete Another Element? Press '0' For Yes or '1' For No");
                q = sc.nextInt();
            }
        }



        obj.forwardTraverse();
//        obj.backwardTraverse();
    }
}
