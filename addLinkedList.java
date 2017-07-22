
import java.util.*;

class Node {

  public int val;
  public Node next;

  Node (int x) {
    val = x;
    next = null;
  }
  void appendToTail() {
    Node end = new Node(0);
    Node n = this;
    while (n.next != null) {
      n = n.next;
    }
      n.next = end;
  }
}
class addLinkedList {

  public static void main (String [] args) {

    Node lst1 = new Node (9);
    lst1.next = new Node (9);
    lst1.next.next = new Node (9);
    lst1.next.next.next = new Node (9);
    Node lst2 = new Node (0);
    lst2.next = new Node (1);



    //check if two linkedlist have different
    Node list1 = lst1;
    Node list2 = lst2;
    int length1 = 1;
    int length2 = 1;


    while (lst1.next != null) {
      length1++;
      lst1 = lst1.next;
    }

    while (lst2.next != null) {
      length2++;
      lst2 = lst2.next;
    }

    while (length1 > length2) {
      length1--;
      lst2.appendToTail();
    }
    while (length2 > length1) {
      length2--;
      lst1.appendToTail();
    }
    //append 0 at the tail of the list has less element
    //so both lists will have the same length now

    //lst2.next.next = new Node(4);
    Node ret = add(list1, list2, list1.val + list2.val);

    Node temp;

    while (ret != null) {
      temp = ret.next;
      System.out.println(ret.val);
      ret = temp;
    }
  }

  public static Node add(Node lst1, Node lst2, int total) {

    Node head = lst1;
    int temp1 = 0;

    int carry = total >= 10 ? 1 : 0;
    total = total % 10;

    while (lst1.next != null && lst2.next != null) {
      //update value for the current node of lst1
      lst1.val = total;
      //calculate the val for the next node
      total = lst1.next.val + lst2.next.val + carry;
      carry = total >= 10 ? 1 : 0;
      total = total % 10;

      //update the value for the next node
      lst1.next.val = total;
      //moving forward
      lst1 = lst1.next;
      lst2 = lst2.next;
    }
    //carry is activated
    if (carry != 0) {
      Node tail = new Node (carry);
      lst1.next = tail;
    }
    return head;
  }

}
