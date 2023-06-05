class Solution {
    public int solution(int[] num_list) {
        int o = 0, e = 0;
        
        for( int num : num_list ) {
            if( num % 2 == 1 )
                o = (o + num) * 10;
            else
                e = (e + num) * 10;
        }
        
        return o / 10 + e / 10;
    }
}