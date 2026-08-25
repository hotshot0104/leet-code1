class Solution {
    public int missingMultiple(int[] nums, int k) {

        ArrayList<Integer> list = new ArrayList<>();

        int max = 0;

        // maximum element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        for (int i = 1; k * i <= max + k; i++) {
            list.add(k * i);
        }

        // check every multiple
        for (int i = 0; i < list.size(); i++) {

            boolean found = false;
            // search this multiple in nums
            for (int j = 0; j < nums.length; j++) {

                if (nums[j] == list.get(i)) {
                    found = true;
                    break;
                }
            }

            // poore nums mein nahi mila
            if (!found) {
                return list.get(i);
            }
        }

        return -1;
    }
}