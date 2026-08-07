class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        ArrayList<Integer> list = new ArrayList<>();

        int i = num.length - 1;
        int carry = 0;//using the old addition approach 

        while (i >= 0 || k != 0 || carry != 0) {

            int digitNum = 0;

            if (i >= 0) {
                digitNum = num[i];
            }

            int digitK = k % 10;

            int sum = digitNum + digitK + carry;

            int digit = sum % 10;//taking out the digit
            carry = sum / 10;//if there will be carry then it will be added the next time 

            list.add(digit);

            i--;//for fetching the last digit
            k = k / 10;//for taking out the last digit of the no we are going to add
        }

        Collections.reverse(list);

        return list;
    }
}