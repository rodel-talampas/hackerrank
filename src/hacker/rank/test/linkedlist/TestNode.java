package hacker.rank.test.linkedlist;

import org.junit.Before;
import org.junit.Test;

public class TestNode {

	Node head = null;
	@Before
	public void init(){
		head = new Node();
		head.setData(2);
		head = new NodeTest().Insert(head, 1);
		head = new NodeTest().Insert(head, 3);
		head = new NodeTest().Insert(head, 4);
		head = new NodeTest().Insert(head, 9);
		head = new NodeTest().Insert(head, 2);
	}
	
	@Test
	public void reverseTest() {
		new NodeTest().ReversePrint(head);
	}

}
