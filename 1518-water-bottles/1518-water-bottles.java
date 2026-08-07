class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int totalbottle = numBottles;

        while (numBottles >= numExchange) {

            int newbottle = numBottles / numExchange;
            int extrabottle = numBottles % numExchange;

            totalbottle += newbottle;

            numBottles = newbottle + extrabottle;
        }

        return totalbottle;
    }
}