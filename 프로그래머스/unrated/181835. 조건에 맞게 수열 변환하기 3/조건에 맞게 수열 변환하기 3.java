class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        int p = k % 2 == 0 ? k : 0;
        int m = k % 2 == 1 ? k : 1;
        
        for (int i = 0; i < arr.length; i++)
            arr[i] = arr[i] * m + p;
            
        return arr;
    }
}