import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        ArrayDeque<String> card1 = new ArrayDeque<>();
        for (int i=0; i<cards1.length; i++){
            card1.addLast(cards1[i]);
        }
        ArrayDeque<String> card2 = new ArrayDeque<>();
        for (int i=0; i<cards2.length; i++){
            card2.addLast(cards2[i]);
        }
        ArrayDeque<String> goals = new ArrayDeque<>();
        for (int i=0; i<goal.length; i++){
            goals.addLast(goal[i]);
        }
        while(!goals.isEmpty()){
            if (!card1.isEmpty() && card1.peekFirst().equals(goals.peekFirst())){
                card1.pollFirst();
                goals.pollFirst();
            }
            else if (!card2.isEmpty() && card2.peekFirst().equals(goals.peekFirst())){
                card2.pollFirst();
                goals.pollFirst();
            }
            else {
                break;
            }
        }
        return goals.isEmpty() ? "Yes" : "No";
    }
}