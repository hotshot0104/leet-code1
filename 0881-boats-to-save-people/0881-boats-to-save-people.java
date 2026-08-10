class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int num = people.length;
        int left=0;
        int right=num-1;
        int boat=0;
        Arrays.sort(people);
        while(left<=right)
        {
         if(people[left]+ people[right]<=limit)
         {
            boat++;
            left++;
            right--;
         }
         else
         {
            right--;
            boat++;
         }
        }
        return boat;
    }
}