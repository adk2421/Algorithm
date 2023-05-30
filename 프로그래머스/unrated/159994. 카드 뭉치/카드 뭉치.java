class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int answer = 0;
        String card1 = String.join(" ", cards1);
        String card2 = String.join(" ", cards2);
        
        for (int i = 0; i < goal.length; i++) {
            if (goal[i].equals(card1.split(" ")[0])) {
                card1 = card1.replaceFirst(goal[i], "").trim();
                
            } else if (goal[i].equals(card2.split(" ")[0])) {
                card2 = card2.replaceFirst(goal[i], "").trim();
                
            } else {
                answer = 1;
                break;
            }
        }
        
        return answer == 0 ? "Yes" : "No";
    }
}