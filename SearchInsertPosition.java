package Easy;

/*
 * Given a sorted array and a target value, 
 * return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order
 */
public class SearchInsertPosition {
	
	public static void main(String[] args) {
		int[] exm1 = {1, 3, 5, 6};
		int target1 = 5;
		int target2 = 2;
		int target3 = 7;
		System.out.println(searchInsertPosition(exm1, target1));
		System.out.println(searchInsertPosition(exm1, target2));
		System.out.println(searchInsertPosition(exm1, target3));
		
	}
	
    public static int searchInsertPosition(int[] nums, int target) {
    	int index = 0;
    	while( target>nums[index]) {
    		index++;
    		if (index==nums.length) {
    			break;
    		}
    	}
		return index;
    }
}
