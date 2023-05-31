import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for( int i = 0; i < photo.length; i++ ) {
            HashSet<String> setPhoto = new HashSet<String>(Arrays.asList(photo[i]));

            for( int j = 0; j < name.length; j++ ) {
                if( setPhoto.contains(name[j]) ) {
                    answer[i] += yearning[j];
                }
            }
        }
        return answer;
    }
}