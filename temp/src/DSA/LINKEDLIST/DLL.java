package DSA.LINKEDLIST;

public class DLL {

    private Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void display() {
       Node temp=head;
       Node last=null;
       while (temp!=null){
           System.out.print(temp.val+" -> ");
           last=temp;
           temp=temp.next;
       }
        System.out.println("END");

       while (last!=null){
           System.out.print(last.val+" -> ");
           last=last.prev;
       }
        System.out.println("START");

    }

    public void insertLast(int val) {

        Node node=new Node(val);
        node.next=null;

        Node last=head;
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        while (last.next!=null){
            last=last.next;
        }
        node.prev=last;
        last.next=node;


    }


    public Node find(int value) {
      Node temp=head;
      while (temp!=null){
          if(temp.val==value){
              return temp;
          }
          temp=temp.next;
      }
      return null;
    }

    public void insert(int after, int val) {

        Node prev=find(after);
        if (prev == null) {
            System.out.println("does not exist");
            return;
        }
        Node node=new Node(val);

        node.prev=prev;
        node.next=prev.next;
        prev.next=node;
        node.next.prev=node;


    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}