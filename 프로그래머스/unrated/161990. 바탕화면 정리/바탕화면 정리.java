class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int len = wallpaper.length;
        int firstItemLen = wallpaper[0].length();
        
        answer[0] = len;
        answer[1] = firstItemLen;
        answer[2] = 0;
        answer[3] = 0;
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < firstItemLen; j++) {
                char item = wallpaper[i].charAt(j);
                
                if (item == '#') {
                    if (answer[0] > i) {
                        answer[0] = i;
                    }
                    if (answer[1] > j) {
                        answer[1] = j;
                    }
                    if (answer[2] < i + 1) {
                        answer[2] = i + 1;
                    }
                    if (answer[3] < j + 1) {
                        answer[3] = j + 1;
                    }
                }
            }
        }
        return answer;
    }
}