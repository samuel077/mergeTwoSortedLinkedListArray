import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
	
	private ListNode node = null;
	private ListNode node2 = null;

	@Before
	public void setupTestData() {
		initialData();
	}
	
	@Test
	public void firstTest(){
		Solution solution = new Solution();
		List<Integer> testArray = new ArrayList<>();
		ListNode result = solution.mergeTwoSortedNode(node, node2);
		while(result.next != null) {
			testArray.add(result.val);
		}
		
		// sorted
		assertEquals(testArray.get(0), new Integer(1));
		assertEquals(testArray.get(1), new Integer(2));
		assertEquals(testArray.get(2), new Integer(3));
		
	}
	
	private void initialData(){
		int [] list1 = new int[]{2};
		int [] list2 = new int[]{1,3};
		
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
		System.out.println("done initialzation");
	}
	
}
