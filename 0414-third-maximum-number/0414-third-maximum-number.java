class Solution {
    public int thirdMax(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        boolean firstSet = false;
        boolean secondSet = false;
        boolean thirdSet = false;

        for (int num : nums) {

            if (firstSet && num == first ||
                secondSet && num == second ||
                thirdSet && num == third) {
                continue;
            }

            if (!firstSet || num > first) {
                third = second;
                thirdSet = secondSet;

                second = first;
                secondSet = firstSet;

                first = num;
                firstSet = true;
            }
            else if (!secondSet || num > second) {
                third = second;
                thirdSet = secondSet;

                second = num;
                secondSet = true;
            }
            else if (!thirdSet || num > third) {
                third = num;
                thirdSet = true;
            }
        }

        return thirdSet ? third : first;
    }
}