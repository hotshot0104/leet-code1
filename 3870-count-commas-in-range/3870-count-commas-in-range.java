class Solution {
    public int countCommas(int n) {
        int count=0;
        if( n <1000)
        {
            return 0;
        }
        else if((n>999)&&(n<=100000))
        {
            for(int i =1000;i<=n;i++)
            count ++;
        }
    return count;
    }
}