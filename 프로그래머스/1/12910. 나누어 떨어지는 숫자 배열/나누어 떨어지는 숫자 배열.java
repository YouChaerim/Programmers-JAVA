import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int n = 0;
        for (int i : arr){
            if (i%divisor == 0){
                n++;
            }
        }
        
        if (n == 0){
            return new int[]{-1};
        }
        
        int[] answer = new int[n];
        int a = 0;
        for (int i : arr){
            if (i%divisor == 0){
                answer[a] = i;
                a++;
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}