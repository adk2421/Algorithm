class Solution {
    public int solution(int[] num_list) {
        int o = 0, e = 0;
        
        for( int num : num_list ) {
            if( num % 2 == 1 )
                o = o * 10 + num;
            else
                e = e * 10 + num;
        }
        
        return o + e;
    }
}