class Solution {
    public int removeElement(int[] nums, int val) {
    int num=nums.length;
    int count=0;
    int neww[]=new int[num];
        for(int i=0;i<num;i++)
        {
            if(nums[i]!=val)
            {
                neww[count]=nums[i];
                count++;
            }
        }
        for(int i=0;i<count;i++)
        {
            nums[i]=neww[i];
        }
return count;
}
}