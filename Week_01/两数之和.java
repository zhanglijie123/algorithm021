class Solution {
      public int[] twoSum(int[] nums, int target) {
        int result[] = new int[nums.length];
        int index =0;
      
          
      //暴力方式 不推荐
        for(int i=0; i<nums.length-1;i++){
            for(int j= i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                  return  new int[]{i,j};
                 }
            }

        }

        
        return  result;
    }
}