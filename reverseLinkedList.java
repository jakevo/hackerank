import java.util.*;

class ListNode {
	public int val;
	public ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}
public class reverseLinkedList {

  public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		node.next.next.next = new ListNode(4);
		node.next.next.next.next = new ListNode(5);
		node.next.next.next.next.next = new ListNode(6);

    ListNode ret = reverse(node);
    while (ret != null) {
      System.out.println (ret.val);
      ret = ret.next;
    }
	}

  //we have linkedlist  1 2 3 4 5 6
  public static ListNode reverse (ListNode node) {

    ListNode temp;
    ListNode previous = null;

    while (node != null) {
      temp = node.next;
      node.next = previous;
      previous = node;
      node = temp;
    }
    return previous;
  }
}
