class Solution {
    public int[] solution(int[] arr) {
        int len = 0, idx = 0;
        for( int item : arr )
            len += item;
        
        int[] answer = new int[len];
        for( int item : arr ) {
            for( int i = idx; i < idx + item; i++ ) {
                answer[i] = item;
            }
            idx += item;
        }

        return answer;
    }
}