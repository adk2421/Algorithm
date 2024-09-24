class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        for (int i = 0; i < str_list.length; i++) {
            String str = String.join("", str_list);
            if ("l".equals(str_list[i])) {
                return i != 0 ? str.substring(0, i).split("") : new String[]{};
            } else if ("r".equals(str_list[i])) {
                return i < str_list.length - 1 ? str.substring(i + 1, str_list.length).split("") : new String[]{};
            }
        }
        return new String[]{};
    }
}