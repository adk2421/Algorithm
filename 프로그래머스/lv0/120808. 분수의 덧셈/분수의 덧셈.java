class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int cnt = 2;

        answer[1] = num1 * num2;

        denum1 = denum1 * num2;
        denum2 = denum2 * num1;

        answer[0] = denum1 + denum2;

        while (true) {
            if (answer[0] % cnt == 0 && answer[1] % cnt == 0) {
                answer[0] /= cnt;
                answer[1] /= cnt;
                cnt = 2;
            } else {
                cnt++;
                if (cnt > answer[1])
                    break;
            }
        }
        return answer;
    }
}