class Solution {
    public int solution(String dartResult) {
        int[] score = new int[3];
        int idx = -1;
        
        for (int i = 0; i < dartResult.length(); i++) {
            char item = dartResult.charAt(i);
            
            if (item == '1') {
                if (dartResult.charAt(i+1) == '0') {
                    score[++idx] = 10;
                    i++;
                } else
                    score[++idx] = 1;
                
            } else if (item >= '0' && item <= '9') {
                score[++idx] = item - 48;
                
            } else if (item == 'D') {
                score[idx] = (int) Math.pow((double) score[idx], 2);
            
            } else if (item == 'T') {
                score[idx] = (int) Math.pow((double) score[idx], 3);
        
            } else if (item == '*') {
                if (idx != 0)
                    score[idx-1] *= 2;
                score[idx] *= 2;
                
            } else if (item == '#') {
                score[idx] *= -1;
            }
        }
        return score[0] + score[1] + score[2];
    }
}