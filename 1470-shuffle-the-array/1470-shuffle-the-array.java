class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[2*n];
        int left=0;
        int right=n;
        for(int i =0;i<2*n;i=i+2)
        {
            ans[i]=nums[left];
            left++;
        }
        for(int i =1;i<2*n;i=i+2)
        {
            ans[i]=nums[right];
            right++;
        }
        return ans;
}
}
