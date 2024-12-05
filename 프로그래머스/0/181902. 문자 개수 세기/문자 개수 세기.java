class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for (char ch : my_string.toCharArray()) {
            answer[ch < 97 ? ch - 65 : ch - 71]++;
        }
        return answer;
    }
}