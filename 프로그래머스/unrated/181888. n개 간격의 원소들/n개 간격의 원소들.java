class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int[] answer = new int[len % n == 0 ? len / n : len / n + 1];
        
        for( int i = 0; i < answer.length; i++ )
            answer[i] = num_list[i * n]; 
        
        return answer;
    }
}