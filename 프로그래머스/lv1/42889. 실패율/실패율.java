import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Double[] fail = new Double[N];
        int failCnt = 0;
        int totalCnt = stages.length;
        
        for (int i = 0; i < N; i++) {
            totalCnt -= failCnt;
            failCnt = 0;
            
            for (int stgItem : stages) {
                if (i + 1 == stgItem)
                    failCnt++;
            }
            
            if (failCnt != 0 && totalCnt != 0)
                fail[i] = (double) failCnt / totalCnt;
            else
                fail[i] = 0.0;
        }
        
        Double[] failClone = fail.clone();
        
        Arrays.sort(fail, Collections.reverseOrder());
        
        for (int j = 0; j < failClone.length; j++) {
            for (int k = 0; k < fail.length; k++) {
                if (fail[j] == failClone[k]) {
                    answer[j] = k + 1;
                    break;
                }
            }
        }
        return answer;
    }
}