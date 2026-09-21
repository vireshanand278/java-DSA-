public class linkedlist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public  Node head;
    public Node tail;
    public void addFirst(int data){

        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){

        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail= newNode;
    }
    public void printAll(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        linkedlist link = new linkedlist();
        link.addFirst(10);
        link.addFirst(20);
        link.addLast(30);
        link.addLast(40);
        link.printAll();
    }
}
