package ListFunctions;// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LinkedListMain{
    public static void main(String[] args){
        LinkedList ll = new LinkedList();

        ll.insertEnd(1);
        ll.insertEnd(2);
        ll.insertEnd(3);
        ll.insertEnd(4);
        ll.insertEnd(5);
//        ll.insertEnd(2);

        


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
    public void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public  void deletedupli(){
        Node ptr1 = head;
        Node ptr2 = head.next;
        while (ptr2!=null){
            if(ptr1.data==ptr2.data){
                ptr1.next=ptr2.next;
                ptr2=ptr2.next;
            }
            else {
                ptr1=ptr1.next;
                ptr2=ptr2.next;
            }
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
    public  int size(){
        Node temp = head;int count = 0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
public void rotate(){
    Node temp = head;
    for(int i = 1;i<size()-1;i++){
        temp=temp.next;
    }
    Node lastNode = temp.next;
    temp.next=null;
    lastNode.next=head;
    head=lastNode;

}
public void middle(){
        int m = size()/2;
        Node temp = head;
        for(int i = 1;i<m;i++){
            temp=temp.next;
        }
    temp.next=temp.next.next;

}
public int max(ArrayList<Integer> list){
        int m = Integer.MIN_VALUE;int max = 0;
        for(int i : list){
            m=Math.max(m,i);
        }
        return m;
}
    public int pairSum() {
        ArrayList<Integer> list = new ArrayList<>();
        int m = size()/2;
        Node temp = head;
        for(int i = 1;i<m;i++){
            temp=temp.next;
        }
        Node head1 = temp.next;
        temp.next=null;
        display(head);
        System.out.println("Node 2");
        display(head1);
        Node heads = reverse(head1);
        System.out.println("reverse");
        display(heads);
        while (head!=null && heads!=null){
            int sum = head.data+heads.data;
            list.add(sum);
            head=head.next;
            heads=heads.next;
        }
        System.out.println(list);
        return max(list);
    }
    public Node reverse(Node head){
        Node prev = null;
        Node present = head;
        Node future = head.next;
        while (present!=null){
            present.next=prev;
            prev=present;
            present=future;
            if(future!=null){
                future=future.next;
            }

        }
        return head=prev;
    }


}
