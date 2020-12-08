方式一：
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //暴力方式
      System.arraycopy(nums2,0,nums1,m,n);
      Arrays.sort(nums1);
    }
}

方式二：
待定

