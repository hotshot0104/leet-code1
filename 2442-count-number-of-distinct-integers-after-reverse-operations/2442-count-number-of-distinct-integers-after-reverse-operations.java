class Solution {
    int reverse(int n)
    {
        int rev=0;
        while(n!=0)
        {
            int a=n%10;
            rev=rev*10+a;
            n=n/10;
        }
        return rev;
    }
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer>list=new HashSet<>();
        for(int i=0;i< nums.length;i++)
        {
            list.add(nums[i]);
            list.add(reverse(nums[i]));
        }
        return list.size();

        
    }
}