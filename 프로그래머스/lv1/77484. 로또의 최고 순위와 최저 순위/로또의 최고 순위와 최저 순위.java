class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = { 7, 7 };
        int O = 0;
        int Z = 0;
        
        for (int lotto : lottos)
            if (lotto == 0)
                Z++;
        
        for (int num : win_nums) {
            for (int lotto : lottos) {
                if (num == lotto) {
                    O++;
                    break;
                }
            }
        }
        answer[0] -= Z == 0 && O == 0 ? 1 : O + Z;
        answer[1] -= O == 0 ? 1 : O;
        
        return answer;
    }
}