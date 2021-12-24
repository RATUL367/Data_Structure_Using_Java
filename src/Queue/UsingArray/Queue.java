package Queue.UsingArray;

public class Queue {
    int arr[] = new int[3];
    int n = arr.length;
    int front= -1;
    int rear = -1;
    void enqueue(int data){
        if(rear == (n-1)){
            System.out.println("Sorry! No Space Available In Your Queue...");
        }
        else {
            if(front==-1 && rear==-1){
                front=0;
                rear=0;
                arr[rear]=data;
            }
            else {
                rear = rear+1;
                arr[rear]=data;
            }
            System.out.println("Inserted Successfully...");
        }
    }
    void dequeue(){
        if(front==-1 && rear==-1){
            System.out.println("Sorry! Your Queue Is Empty...");
        }
        else if(front==rear){
            System.out.println(arr[front]+" Deleted Successfully...");
            front = -1;
            rear = -1;
        }
        else {
            System.out.println(arr[front]+" Deleted Successfully...");
            front=front+1;
        }

    }
    void display(){
        if(front==-1 && rear==-1){
            System.out.println("Sorry! Your Queue Is Empty...");
        }
        else {
            for (int i=front;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

    }
}
