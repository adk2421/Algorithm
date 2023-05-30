class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int num = nums[i] + nums[j] + nums[k];
                    
                    for (int l = 2; l < num / 2; l++) {
                        if (num % l == 0)
                            break;
                        if (l == num / 2 - 1)
                            answer++;
                    }
                }
            }
        }
        return answer;
    }
}