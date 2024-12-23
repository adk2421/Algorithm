class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        for (int i = 1; i <= 30; i++) {
            int cnt = 0;
            for (String str : strArr) {
                if (str.length() == i)
                    cnt++;
            }
            if (cnt > answer) answer = cnt;
        }
        return answer;
    }
}