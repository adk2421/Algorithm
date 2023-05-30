class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int temp = 0;
        
        for (int item : section) {
            if (item >= temp) {
                answer++;
                temp = item + m;
            }    
        }
        return answer;
    }
}