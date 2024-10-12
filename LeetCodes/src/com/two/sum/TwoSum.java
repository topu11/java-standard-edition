package com.two.sum;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    
        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{2,7,11,15}, 9)));
	}

}
class Solution {
    public int[] twoSum(int[] nums, int target) {
       
    	  HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	  
    	  for(int i=0;i<nums.length;i++)
    	  {
    		  int conjugate=target-nums[i];
    		  
    		  if(map.containsKey(conjugate))
    		  {
    			  
    			  return new int[]{i,map.get(conjugate)};
    		  }else
    		  {
    			  map.put(nums[i],i);
    			  //System.out.println(map);
    		  }
    	  }
    	  
    	  
    	
    	return new int[] {1,nums.length}; 
    }
}