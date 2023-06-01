import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int cnt = 0;
        
        for( int item : Arrays.copyOfRange(num_list, n, num_list.length) ) {
            answer[cnt] = item;
            cnt++;
        }
        
        for( int item : Arrays.copyOfRange(num_list, 0, n) ) {
            answer[cnt] = item;
            cnt++;
        }
        
        return answer;
    }
}