class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap <Integer, Integer> myHashMap = new HashMap <Integer, Integer> ();
    
        for(int i = 0; i < nums.length; i++)
        {
            int difference = target - nums[i];
            if(myHashMap.containsKey(difference) == true)
            {
                return new int[] {myHashMap.get(difference), i};
            }
            myHashMap.put(nums[i], i);
        }
        return new int[] {,};
    }

     
}
