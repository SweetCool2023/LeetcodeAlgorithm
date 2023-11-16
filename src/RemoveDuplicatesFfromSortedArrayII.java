import java.util.*;
import java.util.Map.Entry;

public class RemoveDuplicatesFfromSortedArrayII {
	 public int removeDuplicates(int[] nums) {
	     int result = 0;
	     HashMap<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
	     
	     for(int i=0; i<nums.length; i++) {
	    	 if(resultMap.containsKey(nums[i])) {
	    		 resultMap.put(nums[i], resultMap.get(nums[i])+1);
	    	 }
	    	 else
	    		 resultMap.put(nums[i], 1);
	     }
	     
	     for(Map.Entry<Integer, Integer> val : resultMap.entrySet()) {
	    	 int currKey = val.getKey();
	    	 int currVal = val.getValue();
	    	 
	    	 if(currVal == 1)
	    		 result++;
	    	 else 
	    		 result=result+2;
	     }   
	     
	     return result;
		 
	    }

}
