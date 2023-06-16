class Solution {
    public int solution(int a, int b, int c) {
        return
            a == b ?
                b == c ? (a + b + c) * pow(a, b, c, 2) * pow(a, b, c, 3)
                    : (a + b + c) * pow(a, b, c, 2)
                : a == c || b == c ? (a + b + c) * pow(a, b, c, 2)
                    : a + b + c;
    }
    
    public int pow(int a, int b, int c, int p) {
        return (int) (Math.pow(a, p) + Math.pow(b, p) + Math.pow(c, p));
    }
}