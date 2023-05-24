class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        String[] numStr = num_str.split("");
        for (String num : numStr) {
            answer += Integer.parseInt(num);
        }
        return answer;
    }
}