class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int number = total / num;;
        int item;
        
        if (num % 2 == 1) {
            item = number - num / 2;
        } else {
            item = number - num / 2 + 1;
        }
        
        for (int i = 0; i < num; i++) {
            answer[i] = item + i;
        }

        return answer;
    }
}