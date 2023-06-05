class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[Math.abs(end - start) + 1];
        
        for( int i = start; i >= end; i-- )
            answer[start - i] = i;
        
        return answer;
    }
}