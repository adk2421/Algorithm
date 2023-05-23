class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int len = board.length;
        int[][] tempBoard = new int[len+2][len+2];
        
        for (int i = 0; i < len; i++)
            for (int j = 0; j < len; j++)
                tempBoard[i+1][j+1] = board[i][j];
        
        for (int i = 1; i < len+1; i++)
            for (int j = 1; j < len+1; j++)
                if (tempBoard[i][j] == 1)
                    for (int k = i-1; k < i+2; k++)
                        for (int l = j-1; l < j+2; l++)
                            if (tempBoard[k][l] == 0)
                                tempBoard[k][l] = 2;
        
        for (int i = 0; i < len; i++)
            for (int j = 0; j < len; j++)
                if (tempBoard[i+1][j+1] == 0)
                    answer++;
        
        return answer;
    }
}