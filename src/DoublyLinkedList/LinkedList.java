package DoublyLinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    LinkedList(){
        this.head = null;
        this.tail = null;
    }
    public void insertFirst(int data){
        Node newNode = new Node(data);
        if(this.head==null){
            this.head = newNode;
            this.tail = newNode;
        }
        else {
            head.setPrev(newNode);
            newNode.setNext(this.head);
            this.head = newNode;
        }
    }
    public void insertLast(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            insertFirst(data);
        }
        else {
            this.tail.setNext(newNode);
            newNode.setPrev(this.tail);
            this.tail=newNode;
        }
    }
    public void insertAtPos(int data, int p){
        Node newNode = new Node(data);
        Node temp = this.head;
        Node ptr = temp.getNext();
        if(this.head == null){
            insertFirst(data);
        }
        else{
            for(int i=0; i<p-2;i++){
                temp=ptr;
                ptr = ptr.getNext();
            }
            newNode.setPrev(temp);
            newNode.setNext(ptr);
            temp.setNext(newNode);
            ptr.setPrev(newNode);
        }
    }
    public void deleteFirst(){
        if(this.head==null){
            System.out.println("Linked List is Empty");
        }
        else {
            this.head = this.head.getNext();
        }

    }
    public void deleteLast(){
//        Node temp = head;
//        Node ptr = temp.getNext();
        if(this.head==null){
            deleteFirst();
        }
        else{
            tail=tail.getPrev();
            tail.setNext(null);

//  When  tail is not given in the Linked List then use below code
//  and also uncomment the above Node.

//            while (ptr.getNext()==null){
//                temp=ptr;
//                ptr=ptr.getNext();
//            }
//            temp.setNext(null);

        }

    }
    public void deleteAtPos(int p){
        if(this.head==null){
            deleteFirst();
        }
        else{
            Node temp = this.head;
            Node ptr = temp.getNext();
            for(int i=0;i<p-2;i++){
                temp = ptr;
                ptr = ptr.getNext();
            }
            temp.setNext(ptr.getNext());
            ptr.getNext().setPrev(temp);
        }

    }
    public void forwardTraverse(){
        Node temp = this.head;
        if(temp==null){
            System.out.println("linked List is Empty!!");
        }
        else {
//            System.out.print("Foward Traverse: ");
            while (temp!=null){
                System.out.print(temp.getData()+" ");
                temp=temp.getNext();
            }
        }
    }
    public void backwardTraverse(){
        Node temp = this.tail;
        if(temp==null){
            System.out.println("linked List is Empty!!");
        }
        else {
            System.out.print("Backword Traverse: ");
            while (temp!=null){
                System.out.print(temp.getData()+" ");
                temp=temp.getPrev();
            }
        }
    }
}
