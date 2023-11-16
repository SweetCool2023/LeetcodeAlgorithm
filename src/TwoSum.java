import java.util.*;

public class TwoSum {
	// use map to save the difference
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		HashMap<Integer, Integer> diffMap = new HashMap<Integer, Integer>();
		
		for(int i=0; i<nums.length; i++) {
			int currDiff = target-nums[i];
			System.out.println("Current diff: " + currDiff);
			
			if(diffMap.containsKey(nums[i])) {
				result[0] = diffMap.get(nums[i]);
				result[1] = i;
			}
			else {
				diffMap.put(currDiff, i);
			}	
			
			System.out.println("Current map: " + diffMap);
		}		
		
		return result;
		
	}

}
