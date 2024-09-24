class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for (String item : order) {
            answer += item.contains("n") ? 4500 : 5000;
        }
        return answer;
    }
}