
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
class linkedlistPalindrome {

  public static void main (String [] args) {


  }

  public static Boolean isPalindrome(Node list) {


  }

}
