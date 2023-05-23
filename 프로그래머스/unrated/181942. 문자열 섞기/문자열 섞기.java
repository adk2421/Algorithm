class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        for (int i = 0; i < str1.length(); i++)
            answer += str1.split("")[i] + str2.split("")[i];
        
        return answer;
    }
}