class Solution {
    public int solution(int order) {
        int answer = 0;
        while(order>0){
            System.out.println(order%10);
            System.out.println(order/10);
            if (order % 10 != 0 && (order%10)%3 == 0){
                answer += 1;
            }
            order = order/10;
        }
        return answer;
    }
}