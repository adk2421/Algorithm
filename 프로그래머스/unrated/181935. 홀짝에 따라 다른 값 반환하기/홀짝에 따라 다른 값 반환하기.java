class Solution {
    public int solution(int n) {
        int answer = 0;
        int p = n % 2 == 0 ? 2 : 1;
        
        for (double i = (double) n; i > 0; i -= 2)
            answer += (int) Math.pow(i, p);
        
        return answer;
    }
}