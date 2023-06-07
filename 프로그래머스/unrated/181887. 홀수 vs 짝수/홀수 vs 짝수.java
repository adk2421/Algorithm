class Solution {
    public int solution(int[] num_list) {
        int o = 0, e = 0;
        
        for( int i = 0; i < num_list.length; i++ ) {
            if( i % 2 == 1 )
                o += num_list[i];
            else
                e += num_list[i];
        }
        
        return o > e ? o : e;
    }
}