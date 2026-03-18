import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer>[] lines = new Stack[board.length];
        for (int i=0; i<lines.length; i++){
            lines[i] = new Stack<>();
        }
        for(int i=board.length-1; i>-1; i--){
            for (int j=0; j<board[i].length; j++){
                if (board[i][j] > 0){
                    lines[j].push(board[i][j]);
                }
            }
        }
        
        Stack<Integer> bucket = new Stack<>();
        for (int i : moves){
            int n = 0;
            if (!lines[i-1].isEmpty()){
                n = lines[i-1].pop();
            }
            
            if (n > 0){
                if (bucket.isEmpty()){
                    bucket.push(n);
                } else {
                    if (bucket.peek() == n){
                        bucket.pop();
                        answer += 2;
                    } else {
                        bucket.push(n);
                    }
                }   
            }
        }
        
        return answer;
    }
}