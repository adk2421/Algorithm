class Solution {
    public int solution(int n, String control) {
        for( String item : control.split("") ) {
             n += item.equals("w") ? 1
                : item.equals("s") ? -1
                : item.equals("d") ? 10
                : -10;
        }
        return n;
    }
}