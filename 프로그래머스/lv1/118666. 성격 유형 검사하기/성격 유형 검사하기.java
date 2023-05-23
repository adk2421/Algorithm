class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] score = new int[4];
        
        for (int i = 0; i < survey.length; i++) {
            switch (survey[i]) {
                case "RT":
                    score[0] += choices[i] <= 4 ? 4 - choices[i] : -(choices[i] - 4);
                    break;
                case "TR":
                    score[0] += choices[i] <= 4 ? choices[i] - 4 : -(4 - choices[i]);
                    break;
                case "CF":
                    score[1] += choices[i] <= 4 ? 4 - choices[i] : -(choices[i] - 4);
                    break;
                case "FC":
                    score[1] += choices[i] <= 4 ? choices[i] - 4 : -(4 - choices[i]);
                    break;
                case "JM":
                    score[2] += choices[i] <= 4 ? 4 - choices[i] : -(choices[i] - 4);
                    break;
                case "MJ":
                    score[2] += choices[i] <= 4 ? choices[i] - 4 : -(4 - choices[i]);
                    break;
                case "AN":
                    score[3] += choices[i] <= 4 ? 4 - choices[i] : -(choices[i] - 4);
                    break;
                case "NA":
                    score[3] += choices[i] <= 4 ? choices[i] - 4 : -(4 - choices[i]);
                    break;
            }
        }
        
        if (score[0] >= 0)
            answer += "R";
        else
            answer += "T";
        
        if (score[1] >= 0)
            answer += "C";
        else
            answer += "F";
        
        if (score[2] >= 0)
            answer += "J";
        else
            answer += "M";
        
        if (score[3] >= 0)
            answer += "A";
        else
            answer += "N";
        
        return answer;
    }
}