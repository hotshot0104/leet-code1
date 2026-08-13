class Solution {
    public int[] concatWithReverse(int[] nums) {
        int left=0;
        int arr[]=new int[nums.length*2];
        int right=arr.length-1;
        for(int i =0;i<nums.length;i++)
        {
            arr[i]=nums[i];
        }
        while(left<right)
        {
            arr[right]=arr[left];
            left++;
            right--;
        }
        return arr;
    }
}