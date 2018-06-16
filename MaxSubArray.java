
public class MaxSubArray {
	public static int maxSubArray(int[] nums) {
		int ThisSum = 0;
        int MaxSum = nums[0];	//解决最大子列和小于0的情况
        int i, j;
        for (i = 0; i < nums.length; i++) {
            ThisSum = 0;
            for (j = i; j < nums.length; j++) {
                ThisSum += nums[j];
                if (ThisSum > MaxSum)
                    MaxSum = ThisSum;
            }
        }
        return MaxSum;
    }
	
	//O(N) complexity
	public static int maxSubArray2(int[] nums) {
		int ThisSum = nums[0];
        int MaxSum = nums[0];	//解决最大子列和小于0的情况
        for(int i=1;i<nums.length;i++) {
        	ThisSum = Math.max(ThisSum+nums[i], nums[i]);
        	MaxSum = Math.max(ThisSum, MaxSum);
        }
        return MaxSum;
    }
	
	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int[] nums2 = {-3,-2,0,-1};
		System.out.println(maxSubArray(nums));
		System.out.println(maxSubArray2(nums2));
	}
}
