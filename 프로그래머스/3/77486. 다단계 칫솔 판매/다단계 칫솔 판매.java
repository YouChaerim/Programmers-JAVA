import java.util.*;

class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        
        HashMap<String, String> parentMap = new HashMap<>();
        
        HashMap<String, Integer> profitMap = new HashMap<>();
        
        for (int i = 0; i < enroll.length; i++) {
            parentMap.put(enroll[i], referral[i]);
            profitMap.put(enroll[i], 0);
        }
        
        for (int i = 0; i < seller.length; i++) {
            int money = amount[i] * 100;
            distribute(seller[i], money, parentMap, profitMap);
        }
        
        int[] answer = new int[enroll.length];
        for (int i = 0; i < enroll.length; i++) {
            answer[i] = profitMap.get(enroll[i]);
        }
        
        return answer;
    }
    
    private void distribute(String name, int money, HashMap<String, String> parentMap, HashMap<String, Integer> profitMap) {
        if (name.equals("-") || money == 0) {
            return;
        }

        int sendMoney = money / 10;  
        int myMoney = money - sendMoney;

        profitMap.put(name, profitMap.get(name) + myMoney);

        String parent = parentMap.get(name);
        distribute(parent, sendMoney, parentMap, profitMap); 
    }
}