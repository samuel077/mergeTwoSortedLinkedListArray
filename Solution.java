
public class Solution {
	
	public ListNode mergeTwoSortedNode(ListNode head1, ListNode head2) {
		
		ListNode returnList = null;
		ListNode index1, index2, returnHead;
		
		// input validation
		if( head1 != null || head2 != null) {
			if(head1 == null)
				return head2;
			if( head2 == null )
				return head1;
		} else {
			return null;
		}
		
		// head1 and head2 both not null
		index1 = head1;
		index2 = head2;
		returnHead = null;
		while(index1 != null && index2 != null) {
			if(index1.val <= index2.val) {
				if( returnList == null) {
					returnList = index1;
					returnHead = index1;
				}
				else {
					// insert index1
					returnList.next = index1;
					returnList = returnList.next;
				}
				// shift index1
				if(index1.next != null) {
					index1 = index1.next;
				} else {
					// no more elements in index1, point to index2 directly.
					returnList.next = index2;
					break;
				}
			} else {
				// insert index2
				if( returnList == null) {
					returnList = index2 ;
					returnHead = index2;
				}
				else {
					// insert index1
					returnList.next = index2;
					returnList = returnList.next;
				}
				// shift index2
				if(index2.next != null) {
					index2 = index2.next;
				} else {
					// no more elements in index2, point to index2 directly.
					returnList.next = index1;
					break;
				}
			}
		}
		
		return returnHead;
	}
	
}
