class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 1;
        int size = nums.length;

        while (j < size) {

            if (nums[i] != 0) {
                i++;
                j++;
            }
            else if (nums[j] == 0) {
                j++;
            }
            else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
                j++;
            }
        }
    }
}