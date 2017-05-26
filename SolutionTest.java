import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
	
	private ListNode node = null;
	private ListNode node2 = null;
	private ListNode node3 = null;
	private ListNode node4 = null;

	@Before
	public void setupTestData() {
		initialData();
	}
	
	@Test
	public void testBasicMerge(){
		Solution solution = new Solution();
		List<Integer> testArray = new ArrayList<>();
		ListNode result = solution.merge(node, node2);
		while(result.next != null) {
			testArray.add(result.val);
			result = result.next;
		}
		testArray.add(result.val);
		
		// sorted
		assertEquals(testArray.get(0), new Integer(1));
		assertEquals(testArray.get(1), new Integer(3));
		assertEquals(testArray.get(2), new Integer(3));
		assertEquals(testArray.get(3), new Integer(5));
		
	}
	
	@Test
	public void testMergeEmptyArray() {
		Solution solution = new Solution();
		List<Integer> testArray = new ArrayList<>();
		ListNode result = solution.merge(node3, node4);
		while(result.next != null) {
			testArray.add(result.val);
			result = result.next;
		}
		testArray.add(result.val);
		// sorted
		assertEquals(testArray.get(0), new Integer(1));
		assertEquals(testArray.get(1), new Integer(3));
		assertEquals(testArray.get(2), new Integer(5));
	}
	
	private void initialData(){
		int [] list1 = new int[]{3,5};
		int [] list2 = new int[]{1,3};
		int [] list3 = new int[]{};
		int [] list4 = new int[]{1,3,5};
		
		ListNode tempNode1 = null;
		for(int i = 0 ; i < list1.length ; i++) {
			ListNode listNode = new ListNode();
			listNode.val = list1[i];
			listNode.next = null;
			
			if(node == null) {
				node = listNode;
				tempNode1 = node;
			} else {
				node.next = listNode;
				node = node.next;
			}
		}
		node = tempNode1;
		
		ListNode tempNode2 = null;
		for(int i = 0 ; i < list2.length ; i++){
			ListNode listNode = new ListNode();
			listNode.val = list2[i];
			listNode.next = null;
			
			if(node2 == null) {
				node2 = listNode;
				tempNode2 = node2;
			} else {
				node2.next = listNode;
				node2 = node2.next;
			}
		}
		node2 = tempNode2;
		
		ListNode tempNode3 = null;
		for(int i = 0 ; i < list3.length ; i++) {
			ListNode listNode = new ListNode();
			listNode.val = list3[i];
			listNode.next = null;
			
			if(node3 == null) {
				node3 = listNode;
				tempNode3 = node;
			} else {
				node3.next = listNode;
				node3 = node3.next;
			}
		}
		node3 = tempNode3;
		
		ListNode tempNode4 = null;
		for(int i = 0 ; i < list4.length ; i++) {
			ListNode listNode = new ListNode();
			listNode.val = list4[i];
			listNode.next = null;
			
			if(node4 == null) {
				node4 = listNode;
				tempNode4 = node4;
			} else {
				node4.next = listNode;
				node4 = node4.next;
			}
		}
		node4 = tempNode4;
		
		System.out.println("done initialzation");
	}
	
}
