class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=1;
        int temp=0;
        int size=nums.length;
        while(j<size)
        {
            if(nums[i]!=0)
            {
                i++;
                j++;
            }
            else if((nums[i]==0)&&(nums[j]==0))
            {
                j++;
            }
            if((j<size)&&(nums[i]==0)&&(nums[j]!=0))
            {
                temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
                j++;
            }
        }
        
    }
}