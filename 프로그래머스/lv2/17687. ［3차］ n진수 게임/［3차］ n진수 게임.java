class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String str = "";
        
        for( int i = 0; i < t * m; i++ )
            str += Integer.toString(i, n);
        
        String[] arr = str.toUpperCase().split(""); 
        for( int i = p - 1; i < t * m; i += m )
            answer += arr[i];
        
        return answer;
    }
}