class Solution {
    public int[] solution(int[] arr) {
        int beginIdx = -1, endIdx = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                endIdx = i;
                
                if (beginIdx == -1) {
                    beginIdx = i;
                }
            }
        }
        if (beginIdx == -1)
            return new int[]{-1};
        
        int[] answer = new int[endIdx - beginIdx + 1];
        for (int i = beginIdx; i <= endIdx; i++) {
            answer[i - beginIdx] = arr[i];
        }
        
        return answer;
    }
}