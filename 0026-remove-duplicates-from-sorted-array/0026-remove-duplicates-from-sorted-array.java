class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 1;
        int i = 0;
        int size = nums.length;

        int[] arr = new int[size];

        arr[i] = nums[left];
        i++;

        while(right < size) {

            if(nums[left]!= nums[right]) {
                left = right;
                arr[i] = nums[left];
                i++;
            }
            right++;
        }
        for(int j =0; j < i; j++) {

            nums[j]=arr[j];

            
        }
    return i;
    }
}