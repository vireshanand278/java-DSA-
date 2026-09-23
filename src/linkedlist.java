public class linkedlist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){

        Node newNode = new Node(data);
        size++;
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
    public void  addMiddle(int index,int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeFirst(){
        if(head==null){
            return -1;
        } else if (head==tail) {
            int y=head.data;
            head=tail=null;
            size=0;
            return y;
        }
        int x=head.data;
        head=head.next;
        size--;
        return x;
    }

    public int removeLast(){
        if(head==null){
            return -1;
        } else if (head==tail) {
            int y=head.data;
            head=tail=null;
            size=0;
            return y;
        }
        Node temp=head;
        int i=0;
        while(i<size-2){
            temp=temp.next;
            i++;
        }

        int x=tail.data;
        size--;
        temp.next=null;
        tail=temp;
        return x;
    }
    public int find(int data){
        Node temp=head;
        int count=0;
        while(temp != null){
            if(temp.data==data){
                return count;
            }
            temp=temp.next;
            count++;
        }
        return -1;
    }
    public int helper(int data,Node head){
        if(head==null){
            return -1;
        }

        if(head.data==data){
            return 0;
        }
        int index=helper(data,head.next);
        if(index==-1){
            return -1;
        }
        return index+1;

    }
    public int find2(int data){
       return helper(data,head);
    }
    public static void main(String[] args) {
        linkedlist link = new linkedlist();
        link.addFirst(10);
        link.addFirst(20);
        link.addLast(30);
        link.addLast(40);
        link.addMiddle(2,80);
        link.printAll();
        System.out.println("");
        System.out.println(link.size);
        int x=link.removeFirst();
        System.out.println(x);
        link.printAll();
        System.out.println("");
        int y=link.removeLast();
        System.out.println(y);
        link.printAll();
        int z=link.find(80);
        System.out.println("");
        System.out.println(z);
        int z1=link.find(80);
        System.out.println(z1);
    }
}
