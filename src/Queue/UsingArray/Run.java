package Queue.UsingArray;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Queue obj = new Queue();
        Scanner sc = new Scanner(System.in);
        int v=0;int data;
        do{
            System.out.println("ENQUEUE -> 1 || DEQUEUE-> 2 || DISPLAY -> 3 : ");
            int num = sc.nextInt();
            switch (num){
                case 1:
                    System.out.print("Enter Data: ");
                    data = sc.nextInt();
                    obj.enqueue(data);
                    break;
                case 2:
                    obj.dequeue();
                    break;
                case 3:
                    obj.display();
                    break;
                default:
                    System.out.println("Invalid Option !!");
            }
            System.out.println("MAIN MENU -> 0 || EXIT -> ANY KEY : ");
            v = sc.nextInt();

        }while (v==0);
    }
}
