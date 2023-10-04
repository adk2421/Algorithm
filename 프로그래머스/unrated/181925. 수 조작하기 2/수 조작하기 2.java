class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for (int i = 1; i < numLog.length; i++) {
            int num = numLog[i] - numLog[i-1];
            answer += num == 1 ? "w"
                    : num == -1 ? "s"
                    : num == 10 ? "d"
                    : "a";
        }
        return answer;
    }
}