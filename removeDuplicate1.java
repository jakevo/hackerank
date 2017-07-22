import java.util.*;

class Node {
  Node next = null;
  int data;

  public Node(int d) {
    data = d;
  }
}

class removeDuplicate1 {

  public static void main (String [] args) {

    Node list = new Node(2);
    list.next = new Node(1);
    list.next.next = new Node(2);
    list.next.next.next = new Node(10);
    list.next.next.next.next = new Node(3);
    list.next.next.next.next.next = new Node (1);
    removeDuplicate(list);
  }
  //2 1 2 10 3
  public static void removeDuplicate(Node n) {

    ArrayList<Integer> arr = new ArrayList<Integer>();
    Node head = n;
    Node temp = null;
    while (n != null) {
      if (arr.contains(n.data)) {
        temp.next = n.next;
      } else {
        arr.add(n.data);
        temp = n;
      }
      n = n.next;
    }
  }
}
