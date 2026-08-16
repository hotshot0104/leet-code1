class Solution {
    public int largestAltitude(int[] gain) {
        int newvalue=0;
        int max=0;
        for(int i=0;i<gain.length;i++)
        {
            newvalue=newvalue+ gain[i];
            if(max<newvalue)
            {
                max=newvalue;
            }
        }
        return max;
    }
}