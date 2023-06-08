class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = arr1.length - arr2.length;
        
        if( answer == 0 )
            for( int i = 0; i < arr1.length; i++ )
                answer += arr1[i] - arr2[i];
        
        return answer > 0 ? 1 : answer < 0 ? -1 : 0;
    }
}