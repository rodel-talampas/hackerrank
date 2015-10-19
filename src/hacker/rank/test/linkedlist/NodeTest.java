/**
 * 
 */
package hacker.rank.test.linkedlist;

import java.util.Arrays;
import java.util.List;

/**
 * @author rodel.talampas
 *
 */
public class NodeTest {
	Node InsertAt(Node head, int data, int position) {

		Node node = new Node();
		node.data = data;

		if (position == 0) {
			node.next = head;
			return node;
		} else if (position == 1) {
			node.next = head.next;
			head.next = node;
		} else {
			head.next = InsertAt(head.next, data, --position);
		}
		return head;
	}

	Node Delete(Node head, int position) {

		if (position == 0) {
			head = head.next;
		} else {
			head.next = Delete(head.next, --position);
		}
		return head;

	}

	void ReversePrint(Node head) {
		if (head.next==null){
			System.out.println(head.data);
		}else{
			ReversePrint(head.next);
			System.out.println(head.data);
		}
	}

	Node ReInsert(Node head, int data) {

		Node newHead = new Node();
		newHead.data = data;
		newHead.next = head;

		return newHead;
	}

	Node Insert(Node head, int data) {
		if (head == null) {
			head = new Node();
			head.data = data;
		} else {
			head.next = Insert(head.next, data);
		}
		return head;
	}

	void Print(Node head) {
		if (head != null) {
			System.out.println(head.data);
			Print(head.next);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Node head = new Node();
		// new NodeTest().Print(head);
		//
		// head.setData(5);
		// head.setNext(new Node());
		// head.getNext().setData(3);
		//
		// new NodeTest().Print(head);
		Node head = new Node();
		head.setData(2);
		head = new NodeTest().Insert(head, 1);
		head = new NodeTest().Insert(head, 3);
		new NodeTest().Print(head);
		
		new NodeTest().ReversePrint(head);

//		System.out.println("");
//		int[] input = { 5, 1, 2, 3, 4, 5 };
//
//		head = null;
//
//		for (int i : input) {
//			head = new NodeTest().ReInsert(head, i);
//		}
//		new NodeTest().Print(head);
//
//		System.out.println("---------------");
//
//		int[][] arInput = { { 5, 0 }, { 3, 0 }, { 5, 1 }, { 4, 2 } };
//
//		head = new Node();
//		head.data = 2;
//
//		List<int[]> slist = Arrays.asList(arInput);
//		for (int[] first : arInput) {
//			System.out.println(Arrays.toString(first));
//			head = new NodeTest().InsertAt(head, first[0], first[1]);
//			new NodeTest().Print(head);
//			System.out.println("---------------");
//		}

	}

}
