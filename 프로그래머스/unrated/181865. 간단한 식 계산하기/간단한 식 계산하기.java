class Solution {
    public long solution(String binomial) {
        long answer = 0;
        String[] exp = binomial.split(" ");
        
        switch( exp[1] ) {
            case "+":
                answer = Long.parseLong(exp[0]) + Long.parseLong(exp[2]);
                break;
            case "-":
                answer = Long.parseLong(exp[0]) - Long.parseLong(exp[2]);
                break;
            case "*":
                answer = Long.parseLong(exp[0]) * Long.parseLong(exp[2]);
                break;
        }
        return answer;
    }
}