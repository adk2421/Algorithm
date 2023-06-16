class Solution {
    public int solution(int a, int b, int c) {
        return
            a == b ?
                b == c ? pow(a, b, c, 1) * pow(a, b, c, 2) * pow(a, b, c, 3)
                    : pow(a, b, c, 1) * pow(a, b, c, 2)
                : a == c || b == c ? pow(a, b, c, 1) * pow(a, b, c, 2)
                    : pow(a, b, c, 1);
    }
    
    public int pow(int a, int b, int c, int p) {
        return (int) (Math.pow(a, p) + Math.pow(b, p) + Math.pow(c, p));
    }
}