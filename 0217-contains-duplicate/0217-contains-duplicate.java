class Solution {
    public boolean containsDuplicate(int[] nums) {
        int num=nums.length;
        Arrays.sort(nums);
        for(int i =0;i<num-1;i++)
        { 
        if(nums[i]==nums[i+1])
        {
            return true;
        }
        }
        return false;
    }
}