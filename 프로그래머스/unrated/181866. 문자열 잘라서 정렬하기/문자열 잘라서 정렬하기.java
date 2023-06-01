import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        ArrayList<String> list = new ArrayList<String>();
        
        for( String item : myString.split("x") ) {
            if ( !item.isEmpty() ) {
                list.add(item);
            }
        }
        String[] answer = list.toArray(new String[0]);
        Arrays.sort(answer);
        
        return answer;
    }
}