import java.util.ArrayList;

class Solution {
    public ArrayList solution(int[] arr, int[][] intervals) {
        ArrayList answer = new ArrayList();
        
        for (int i = 0; i < 2; i++) {
            for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                answer.add(arr[j]);
            }
        }
        return answer;
    }
}