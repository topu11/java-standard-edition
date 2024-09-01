package arraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class LearningArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //System.out.println("Allah Akbar");
//       List<Object> list = new ArrayList<Object>();
//       
//       list.add("12121");
//       list.add(123);
//       list.add(12.36);
//       list.add(true);
//       
//       for (Object obj: list)
//       {
//    	   System.out.println(obj);
//       }
//       HashMap<String, String> capitalCities = new HashMap<String, String>();
//
//       // Add keys and values (Country, City)
//       capitalCities.put("England", "London");
//       capitalCities.put("Germany", "Berlin");
//       capitalCities.put("Norway", "Oslo");
//       capitalCities.put("USA", "Washington DC");
//       System.out.println(capitalCities);
//       System.out.println(capitalCities.get("England"));
//       System.out.println("Is the key '20' present? " + 
//    		   capitalCities.containsKey("Germany"));
       TwoSum twoSum1=new TwoSum();
       System.out.println(Arrays.toString(twoSum1.twoSum(new int[] {1,2,3,4,5,8,7}, 11)));
      
	}

}

class TwoSum
{
	 public int[] twoSum(int[] nums, int target) {
	     
         HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
      
         for (int i = 0; i < nums.length; i++) {
             int complement = target - nums[i];
             if (map.containsKey(complement)) {
                 return new int[]{map.get(complement), i};
             }
             map.put(nums[i], i);
         }
         return null;
    }
}





