class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int container=capacity;
        int totalstep=0;
        for (int i=0; i<plants.length;i++) {
            if (container<plants[i]) {
                totalstep=totalstep+2*i;
                container=capacity;
            }
            container=container-plants[i];
            totalstep++;
        }
        return totalstep;
    }
}