import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        String str = "";
        
        for (int i = 0; i < arr.length; i++) {
            int len = str.length();
            if (len == 0) {
                str += arr[i];
            } else {
                if ((arr[i] + "").equals(str.substring(len-1, len))) {
                    str = str.substring(0, len-1);
                } else {
                    str += arr[i];
                }
            }
        }
        
        return str.length() == 0 ? new int[]{-1}
            : Arrays.asList(str.split("")).stream().mapToInt(Integer::parseInt).toArray();
    }
}