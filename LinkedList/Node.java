package LinkedList;
public class Node {
    public int data;
    public Node next;


    public Node(int data){
        this.data=data;
        this.next=null;
    }

    public static void main(String[]args){
        Node n1=new Node(10);
        Node n2=new Node(20);
        System.out.println(n1.next);
        System.out.println(n1.data);
        n1.next=n2;
        
        System.out.println(n1.next);
        System.out.println(n1.data);
        System.out.println(n1.next.data);
        System.out.println(n2.data);
        
    }
}
