class Solution {
    public int solution(String[] babbling) {
        String[] item = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for (int i = 0; i < babbling.length; i++) {
            int leng = 0;
            
            for (String arr : item) {
                if (babbling[i].indexOf(arr) > -1)
                    leng += arr.length();
            }
            answer += babbling[i].length() == leng ? 1 : 0;
        }
        return answer;
    }
}