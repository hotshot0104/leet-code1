import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}

public class QUESTION215 {
    // Wrapper for local testing if needed
    public int findKthLargest(int[] nums, int k) {
        return new Solution().findKthLargest(nums, k);
    }
}
