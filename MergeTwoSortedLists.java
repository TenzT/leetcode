/*
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 */

/*
 * Hints: Handling two listNode as two stack, 
 * and with pop operation we can solve it!
 * Method2: Solve the problem recursively!!
 */
package Easy;

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode mergeHead;        
        if(l1.val < l2.val) {
        	mergeHead = new ListNode(l1.val);
        	l1 = l1.next;
        } else {
        	mergeHead = new ListNode(l2.val);
        	l2 = l2.next;
        }
        
        ListNode pmergeHead = mergeHead;
        while(l1!=null && l2!=null) {
        	if(l1.val < l2.val) {
            	pmergeHead.next = new ListNode(l1.val);
            	pmergeHead = pmergeHead.next;
            	l1 = l1.next;
            } else {
            	pmergeHead.next = new ListNode(l2.val);
            	pmergeHead = pmergeHead.next;
            	l2 = l2.next;
            }
        }
        
        if(l1 == null) {
        	pmergeHead.next = l2;
        }
        if(l2 == null) {
        	pmergeHead.next = l1;
        }
    	return mergeHead;
    }
    public static void main(String[] args) {
    	//Initializing l1
    	ListNode  l1 = new ListNode(1);
    	l1.next = new ListNode(2);
    	l1.next.next = new ListNode(4);
    	
    	//Initializing l1
    	ListNode l2 = new ListNode(1);
    	l2.next = new ListNode(3);
    	l2.next.next = new ListNode(4);
    	
    	ListNode l3 = mergeTwoLists(l1, l2);
    	
    	while(l3 != null) {
    		System.out.print(l3.val);
    		l3 = l3.next;
    	}
    }
}



class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { 
    	val = x; 
    }
}