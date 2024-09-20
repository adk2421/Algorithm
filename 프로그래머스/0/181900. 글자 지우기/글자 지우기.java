class Solution {
    public String solution(String my_string, int[] indices) {
        String[] answer = my_string.split("");
        for (int num : indices) { answer[num] = ""; }
        return String.join("", answer);
    }
}