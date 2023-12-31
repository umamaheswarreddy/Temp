package DSA.LINKEDLIST;

/**
 * Licensed Materials - Property of IBM 6949-80Q © Copyright IBM Corp. 2019 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 *
 * @author 002KA5
 * @project temp
 * @created-on 24/08/22
 */
public class LL {

    private Node head;
    private Node tail;
    private int size;

    public class Node {

       private int value;
       private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value,Node next) {
            this.value = value;
            this.next=next;
        }
    }

    public void insertFirst(int val) {

        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size=size+1;
    }
    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size = size + 1;

    }
    public void insertLastWithOutUsingTail(int val) {
        Node node=new Node(val);
        Node temp=head;
        while (temp.next != null) {
            temp=temp.next;
        }
        temp.next=node;
        size = size + 1;
    }
    public void insert(int val, int index) {
        if(index==0) insertFirst(val);
        else if(index==size) insertLast(val);
        else {

            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }

            Node q=temp.next;

            Node node=new Node(val);
            node.next=q;
            temp.next=node;

            size=size+1;

        }

    }
    public int deleteFirst() {
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;

    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail=secondLast;
        tail.next=null;
        size--;
        return val;

    }
    public int delete(int index){
        if(index==0) return deleteFirst();
        if(index==size-1) return deleteLast();

        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        size--;
        return val;

    }
    public void display(int index){
        Node temp=head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        System.out.println("value at index "+index+" :" +temp.value);

    }
    public Node get(int index){
        Node temp=head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
       return temp;

    }
    public Node find(int val){
        Node temp=head;
        while (temp!=null){
            if(temp.value==val){
                System.out.println("find value "+temp.value);
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public void duplicates(){

        Node temp=head;
        while (temp.next!=null){
            if(temp.value==temp.next.value){
                temp.next=temp.next.next;
                size--;
            }
            else {
                temp=temp.next;
            }
        }
        tail = temp;
        tail.next = null;

    }

    public void reverse(){

        if(size>2){
            return;
        }
        Node prev=null;
        Node present=head;
        Node next=present.next;

        while (present!=next){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null){
                next=next.next;
            }
        }
        head=prev;

    }

    public static LL merge(LL first, LL second) {

        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while (f != null && s != null) {

            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }
        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }




}
