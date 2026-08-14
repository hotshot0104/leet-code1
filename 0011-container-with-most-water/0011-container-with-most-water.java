class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j= height.length-1;
        int mul=0;
        while(i<j)
        {
            int area=Math.min(height[i], height[j]) * (j - i);
            if(mul<area)
            {
               mul = area;
            }
                if(height[i]<height[j])
                {
                    i++;
                }
                else
                {
                    j--;
                }
        }
        return mul;
    }
}