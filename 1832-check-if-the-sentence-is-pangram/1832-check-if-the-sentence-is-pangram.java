class Solution {
    public boolean checkIfPangram(String sentence) {

        int count = 0;

        boolean[] visited = new boolean[26];//visited wala count karega

        for(int i = 0; i < sentence.length(); i++)
        {
            int index = sentence.charAt(i) - 'a';

            if(visited[index] == false)
            {
                visited[index] = true;
                count++;
            }
        }

        return count == 26;//returns true or false
    }
}