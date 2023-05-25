class Solution {
    public int solution(int[] num_list) {
        int hap = 0;
        int gop = 1;
        
        for (int num : num_list) {
            hap += num;
            gop *= num;
        }
        
        if (Math.pow(hap,2) > gop)
            return 1;
            
        return 0;
    }
}