class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        return eq.equals("=") && n == m
            || ineq.equals(">") && n > m
            || ineq.equals("<") && n < m ? 1 : 0;
    }
}