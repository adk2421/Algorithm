import java.util.List;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        
        for (int[] query : queries) {
            String prefix = answer.substring(0, query[0]);
            String suffix = answer.substring(query[1] + 1, answer.length());
            
            List<String> splitStr = Arrays.asList(answer.substring(query[0], query[1] + 1).split(""));
            Collections.reverse(splitStr);
            
            answer = prefix + String.join("", splitStr) + suffix;
        }
        
        return answer;
    }
}