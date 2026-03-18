class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i=0; i<prices.length; i++){
            int n = prices[i];
            int time = 0;
            for (int j=i+1; j<prices.length; j++){
                time += 1;
                if (n > prices[j]){
                    break;
                }
            }
            answer[i] = time;
        }
        return answer;
    }
}