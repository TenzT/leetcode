/*
 *  Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.
 *  Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *  Hints: Using two 'pointer' is always useful within in-place problems
 *  Inspiration:If what is left beyond the correct answer are useless,we can designate the length of new array.
 */
package Easy;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;		//pointer to 'new' array
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {	//
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }	
    
    public static void main(String[] args) {
		int[] nums = new int[] {1,1,2};
		
		System.out.println(
				removeDuplicates(nums));
	}
}

