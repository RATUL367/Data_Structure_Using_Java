package StackUsingLinkedList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Stack obj = new Stack();
        Scanner sc = new Scanner(System.in);
        int v=0;int data;
        do{
            System.out.println("PUSH -> 1 || POP-> 2 || DISPLAY -> 3 || PEEK -> 4: ");
            int num = sc.nextInt();
            switch (num){
                case 1:
                    System.out.print("Enter Data: ");
                    data = sc.nextInt();
                    obj.push(data);
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.display();
                    break;
                case 4:
                    obj.peek();
                    break;
                default:
                    System.out.println("Invalid Option !!");
            }
            System.out.println("MAIN MENU -> 0 || EXIT -> ANY KEY : ");
            v = sc.nextInt();

        }while (v==0);
    }
}
