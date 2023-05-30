import java.util.ArrayList;

class Solution {
    public ArrayList solution(int[] answers) {
        ArrayList answer = new ArrayList();
        int cnt = 0;
        int[] temp = new int[3];
        int[][] pattern = {{ 1, 2, 3, 4, 5 }, { 2, 1, 2, 3, 2, 4, 2, 5 }, { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 }};
        
        for (int i = 0; i < 3; i++) {
            int len = pattern[i].length;
            
            for (int j = 0; j < answers.length; j++)
                cnt += pattern[i][j % len] == answers[j] ? 1 : 0;
            
            temp[i] = cnt;
            cnt = 0;
        }
        
        if (temp[0] > temp[1]) {
            if (temp[0] > temp[2])
                answer.add(1);
            else if (temp[0] == temp[2]) {
                answer.add(1);
                answer.add(3);
            } else {
                answer.add(3);
            }
        } else if (temp[0] == temp[1]) {
            if (temp[0] > temp[2]) {
                answer.add(1);
                answer.add(2);
            } else if (temp[0] == temp[2]) {
                answer.add(1);
                answer.add(2);
                answer.add(3);
            } else {
                answer.add(3);
            }
        } else {
            if (temp[1] > temp[2])
                answer.add(2);
            else if (temp[1] == temp[2]) {
                answer.add(2);
                answer.add(3);
            } else {
                answer.add(3);
            }
        }
        
        return answer;
    }
}