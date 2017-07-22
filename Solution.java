//print all prime numbers up to given Integer

import java.util.LinkedList;
import java.util.Scanner;


class ListNode {
	public int val;
	public ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}

	@Override
	public String toString() {
		return val + " -> " + next;
	}
}

public class Solution {

	public static void main(String[] args) {
		ListNode list = new ListNode(1);
		list.next = new ListNode(2);
		list.next.next = new ListNode(3);
		list.next.next.next = new ListNode(4);
		list.next.next.next.next = new ListNode(5);
		list.next.next.next.next.next = new ListNode(6);
		subtract(list);
	}

	public static ListNode subtract(ListNode list1) {
		// TODO Auto-generated method stub
		ListNode curr1 = list1;
		ListNode slow = list1;
		ListNode fast = slow.next;

		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

		}

		ListNode temp = reverseList(list1);

		ListNode secondHalf = temp;
		while(curr1 != null && secondHalf != null) {
			curr1.val = secondHalf.val - curr1.val;
			curr1 = curr1.next;
			secondHalf = secondHalf.next;
		}
		//reverseList(temp);

		//System.out.println(list1);
		return list1;
	}

	public static ListNode reverseList(ListNode slow) {
		// TODO Auto-generated method stub
    System.out.println("here it is");
		ListNode prev = null;
		ListNode curr = slow;
		ListNode temp;
		while(curr != null) {

			temp = curr.next;

			curr.next = prev;

			prev = curr;
      System.out.println (curr.next);

			curr = temp;
		}

    //System.out.println(curr);
    //System.out.println(temp);

		slow = prev;
		return slow;
	}
}
