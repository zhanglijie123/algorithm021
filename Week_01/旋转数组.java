class Solution {
    public void rotate(int[] nums, int k) {
         for(int i=0;i<k;i++){//旋转k次
            int pre = nums[nums.length-1];//记载最后一个
            for(int j=0;j<nums.length;j++){
                int temp = nums[j];
                nums[j] = pre;
                pre = temp;
            }
        }
    }
}