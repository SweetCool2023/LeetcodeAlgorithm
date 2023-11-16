import java.util.Arrays;

public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
		int[] sumArray = new int[nums.length];
		sumArray[0] = nums[0];
		
		for(int i=1; i<nums.length; i++) {
			sumArray[i] = Math.max(nums[i], sumArray[i-1]+nums[i]);
		}
		
		return Arrays.stream(sumArray).max().getAsInt();
	}

}
