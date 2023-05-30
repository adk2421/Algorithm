class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length - 1;
        int[] answer = new int[len + 2];
        
        for (int i = 0; i < len + 1; i++)
            answer[i] = num_list[i];
        
        answer[len + 1] = num_list[len] > num_list[len - 1]
            ? num_list[len] - num_list[len - 1]
            : num_list[len] * 2;
        
        return answer;
    }
}