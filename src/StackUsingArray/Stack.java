package StackUsingArray;

public class Stack {
    int top = -1;
    int n = 10;
    int arr[] = new int[n];

    void push(int data) {
        if (top == (n - 1)) {
            System.out.println("Sorry!! No More Space Available In Your Stack...");
        } else {
            top = top + 1;
            arr[top] = data;
            System.out.println("Inserted Successfully...");
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("Sorry!! Stack Is Empty...");
        }
        else {
            int pop_data=arr[top];
            top=top-1;
            System.out.println(pop_data+ " Deleted Successfully...");
        }
    }
    void peek(){
        if(top==-1){
            System.out.println("Sorry!! Stack Is Empty...");
        }
        else {
            System.out.println("Peek Element: "+arr[top]);
        }
    }
    void display(){
        if(top==-1){
            System.out.println("No Data Found !!");
        }
        else {
            for(int i=top; i>=0;i--)
                System.out.println(arr[i]);
        }

    }
}
