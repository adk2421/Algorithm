import java.util.ArrayList;

class Solution {
    public ArrayList solution(int n) {
        ArrayList answer = new ArrayList();
        answer.add(n);
        
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                answer.add(n);
            }
            else {
                n = 3 * n + 1;
                answer.add(n);
            }
        }
        return answer;
    }
}