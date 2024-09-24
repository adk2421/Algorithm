class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int start = n == 1 ? 0 : slicer[0];
        int end = n == 2 ? num_list.length : slicer[1] + 1;
        int gap = n == 4 ? slicer[2] : 1;
        
        int[] answer = new int[n == 4 ? (end - start + gap - 1) / gap : end - start];
        int cnt = 0;
        for (int i = start; i < end; i+=gap) {
            answer[cnt++] = num_list[i];
        }
        
        return answer;
    }
}