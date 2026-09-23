class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        int count = 1;
        int current = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != current) {
                current = nums[i];
                count++;
            }

            if (count == 3) {
                return current;
            }
        }

        return nums[nums.length - 1];
    }
}