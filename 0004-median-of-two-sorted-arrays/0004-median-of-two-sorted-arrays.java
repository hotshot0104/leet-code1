class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int newsize=nums1.length+nums2.length;
        double bhai=0.0;
        int[] arr= new int[newsize];
        for (int i = 0; i < nums1.length; i++) {
            arr[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            arr[nums1.length + i] = nums2[i];
        }

        Arrays.sort(arr);
        if(newsize%2!=0)
            {
                return arr[newsize/2];
            }
            
        else
        {
        int mid=newsize/2;
        bhai=(arr[mid-1]+arr[mid])/2.0;
        }
        return bhai;
    }
}