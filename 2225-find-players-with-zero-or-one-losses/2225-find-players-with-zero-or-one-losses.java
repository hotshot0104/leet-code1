class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {

        Map<Integer, Integer> Winnermap = new HashMap<>();
        Map<Integer, Integer> Losermap = new HashMap<>();

        for (int[] match : matches) {
            int winner = match[0];
            int looser = match[1];

            Winnermap.put(winner, Winnermap.getOrDefault(winner, 0) + 1);
            Losermap.put(looser, Losermap.getOrDefault(looser, 0) + 1);
        }

        List<Integer> Winnerlist = new ArrayList<>();
        List<Integer> Looserlist = new ArrayList<>();
        for (int player : Winnermap.keySet()) {
            if (!Losermap.containsKey(player)) {
                Winnerlist.add(player);
            }
        }

        for (Map.Entry<Integer, Integer> loose : Losermap.entrySet()) {
            if (loose.getValue() == 1) {
                Looserlist.add(loose.getKey());
            }
        }

        Collections.sort(Winnerlist);
        Collections.sort(Looserlist);

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(Winnerlist);
        answer.add(Looserlist);

        return answer;
    }
}