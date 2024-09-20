import java.util.StringTokenizer;

class Solution {
    public String[] solution(String myStr) {
        StringTokenizer st = new StringTokenizer(myStr, "abc");
        String[] answer = new String[st.countTokens()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = st.nextToken();
        }
        return answer.length == 0 ? new String[] {"EMPTY"} : answer;
    }
}