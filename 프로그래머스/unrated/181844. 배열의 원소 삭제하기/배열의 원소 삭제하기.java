import java.util.ArrayList;

class Solution {
    public ArrayList solution(int[] arr, int[] delete_list) {
        ArrayList list = new ArrayList();
        
        for( int item : arr )
            list.add(item);
        
        for( int item : delete_list )
            list.remove((Object)item);
        
        return list;
    }
}