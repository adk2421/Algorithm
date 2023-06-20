class Solution {
    public int[] solution(String myString) {
        String[] myStr = myString.split("x", -1);
        int[] answer = new int[myStr.length];
        
        for( int i = 0; i < answer.length; i++ )
            answer[i] = myStr[i].length();
        
        return answer;
    }
}