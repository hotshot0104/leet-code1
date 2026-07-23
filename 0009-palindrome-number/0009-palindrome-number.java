class Solution {
    public boolean isPalindrome(int x) {
        int rev;
        rev=0;
        int m ;
        m=x;
        while(x!=0)
        {
            int a = x%10;
           rev = rev*10+a;
            x=x/10;
        }
        if(m<0)
        {
            rev=rev*-1;
        }
        if(rev==m)
        {
            return true;
        }
        else return false;
        
    }
}