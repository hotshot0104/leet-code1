class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] positive =new int[nums.length/2];
        int[] negative=new int[nums.length/2];
        int[] ok= new int[nums.length];
        int p =0;
        int n =0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                positive[p]=nums[i];
                p++;         
            }
            else
            {
                negative[n]=nums[i];
                n++;
            }
        }
        p=0;
        n=0;
        for(int i =0;i<nums.length;i=i+2)
        {
            ok[i]=positive[p];
            p++;
        }
        for(int i=1;i<nums.length;i=i+2)
        {
            ok[i]=negative[n];
            n++;
        }
        return ok;
    }
}