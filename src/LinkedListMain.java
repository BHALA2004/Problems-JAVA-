// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class LinkedListMain{
    public static void main(String[] args){
        LinkedList ll = new LinkedList();

        ll.insertEnd(10);
        ll.insertEnd(20);
        ll.insertEnd(30);
        ll.insertEnd(40);
        ll.insertBegin(50);
        ll.deleteBegin();
        ll.deleteEnd();
        System.out.println(ll.search(80));
        ll.display();
    }
}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
}
class LinkedList{
    Node head,tail;
    public void insertBegin(int data){
        Node node = new Node(data);
        node.next=head;
        head=node;
    }
    public void insertEnd(int data){
        Node node = new Node(data);
        if(head==null){
            head=tail=node;
        }
        else{
            tail.next=node;
            tail=node;
        }
    }
    public void deleteBegin(){
        head=head.next;
    }
    public void deleteEnd(){
        Node temp = head;
        while(temp.next!=tail){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public boolean search(int data){
        Node temp = head;
        while(temp!=null){
            if(temp.data==data){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
}
