class Solution {
    public int solution(String myString, String pat) {
        return myString.toLowerCase().replace("a", "B").replace("b", "A").contains(pat) ? 1 : 0;
    }
}