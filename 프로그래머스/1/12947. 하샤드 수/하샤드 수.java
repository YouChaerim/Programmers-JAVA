class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int num = x;
        int a = 0;
        while(num>0){
            a += num%10;
            num = num/10;
        }
        if (x%a==0){
            answer = true;
        }
        return answer;
    }
}