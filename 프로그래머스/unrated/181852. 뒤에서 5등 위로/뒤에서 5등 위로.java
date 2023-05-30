import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public ArrayList solution(int[] num_list) {
        ArrayList arr = new ArrayList();
        
        Arrays.sort(num_list);
        for (int num : num_list)
            arr.add(num);
        
        for (int i = 0; i < 5; i++)
            arr.remove(arr.get(0));
            
        return arr;
    }
}