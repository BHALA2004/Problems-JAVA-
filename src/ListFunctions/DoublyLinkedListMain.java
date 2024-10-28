package ListFunctions;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyImpl.insertEnd(10);
        DoublyImpl.insertEnd(20);
        DoublyImpl.insertEnd(30);
        DoublyImpl.insertEnd(40);
        DoublyImpl.insertEnd(50);
        System.out.println(DoublyImpl.size());
        DoublyImpl.deleteSpecific(2);
        DoublyImpl.display();

    }
}
class DoublyNode{
    DoublyNode prev;
    int data;
    DoublyNode next;

    public DoublyNode(int data) {
        this.data = data;
    }
}

class DoublyImpl{
    static DoublyNode head,tail;
    public static void insertEnd(int data){
        if(head==null){
            DoublyNode doublyNode = new DoublyNode(data);
            doublyNode.prev=null;doublyNode.next=null;head=doublyNode;tail=doublyNode;
        }
        else {
            DoublyNode doublyNode = new DoublyNode(data);
            doublyNode.prev=tail;
            tail.next=doublyNode;
            tail=doublyNode;
        }
    }
    public static void deleteBegin(){
        head=head.next;
        head.prev=null;
    }
    public static void deleteEnd(){
        tail=tail.prev;
        tail.next=null;
    }
    public static int size(){
        DoublyNode temp = head;int count = 0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static void deleteSpecific(int data){
        DoublyNode temp = head;
        for(int i = 1;i<data;i++){
            temp=temp.next;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;

    }
    public static void display(){
        DoublyNode temp= head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
