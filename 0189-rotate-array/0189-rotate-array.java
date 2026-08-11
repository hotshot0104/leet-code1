    class Solution {
        public void rotate(int[] nums, int k) {
            int left=0;
            int temp=0;
            int right=nums.length;
            k = k % nums.length;
            reverse(nums,0,right-1);
            reverse(nums,0,k-1);
            reverse(nums,k,right-1); 
            }
    public void reverse(int[] nums, int left, int right) {
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
        }
