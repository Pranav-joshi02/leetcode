class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int bestForI = values[0];
        int answer = 0;

        for (int j = 1; j < values.length; j++) {
            answer = Math.max(answer, bestForI + values[j] - j);
            //answer   = bestForI + values[j] - j

            //bestForI = best values[i] + i seen so far
            bestForI = Math.max(bestForI, values[j] + j);
        }

        return answer;
    }
}