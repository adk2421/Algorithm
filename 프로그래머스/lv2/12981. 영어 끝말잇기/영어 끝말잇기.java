import java.util.HashSet;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = { 0, 0 };
        HashSet<String> temp = new HashSet<String>();
        temp.add(words[0]);
        
        for( int i = 1; i < words.length; i++ ) {
            if( temp.contains(words[i]) ) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
                
            } else if( words[i - 1].split("")[words[i - 1].length() - 1].hashCode() 
                      != words[i].split("")[0].hashCode() ) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            temp.add(words[i]);
        } 
        return answer;
    }
}