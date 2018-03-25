/*
 * Given an array and a value, remove all instances of that value in-place and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
package Easy;

public class RemoveElement {
//	public static int removeElement1(int[] nums, int val) {
//		if(nums.length == 1) {
//			if(val == nums[0]) {
//				return 0;
//			} else {
//				return 1;
//			}
//		}
//		
//		int back = nums.length - 1;
//		int front = 0;
//		boolean changeFlag = false;
//		while(front < back) {
//			if(val != nums[front]) {
//				front++;
//			} else {
//				if(val == nums[back]) {
//					back--;
//				} else {
//					nums[front] = nums[back];
//					changeFlag = true;
//					back--;
//				}
//			}
//		}
//        if(back ==0 ){
//            return 0;
//        }
//		if(changeFlag==true) {
//			return front + 1;
//		} else {
//			return nums.length;
//		}
//	}
	
	public static int removeElement2(int[] nums, int val) {
		int m = 0;
		for(int i=0;i<nums.length;i++) {
			if(val != nums[i]) {
				nums[m] = nums[i];
				m++;
			}
		}
		return m;
	}	
	public static void main(String[] args) {
		int[] nums = new int[] {3, 2, 2, 3};
		int newLength = removeElement2(nums, 3);
		for(int i=0;i<newLength;i++) {
			System.out.print(nums[i] + " ");
		}

	}
}
