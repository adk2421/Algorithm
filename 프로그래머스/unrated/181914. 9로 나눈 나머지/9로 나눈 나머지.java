import java.math.BigInteger;

class Solution {
    public BigInteger solution(String number) {
        return new BigInteger(number).remainder(new BigInteger("9"));
    }
}