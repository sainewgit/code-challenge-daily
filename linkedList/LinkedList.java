package linkedList;

public class LinkedList {
    Node head;

    public void insert(int i) {
        Node newNode=new Node(i);
        if (head==null)
        {
            head=newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void print() {
        Node temp=head;
        while (temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
