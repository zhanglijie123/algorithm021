class Solution {
    public void rotate(int[] nums, int k) {
         for(int i=0;i<k;i++){//��תk��
            int pre = nums[nums.length-1];//�������һ��
            for(int j=0;j<nums.length;j++){
                int temp = nums[j];
                nums[j] = pre;
                pre = temp;
            }
        }
    }
}