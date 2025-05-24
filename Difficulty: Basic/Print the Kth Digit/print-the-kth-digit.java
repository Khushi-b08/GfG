// User function Template for Java
import java.math.BigInteger;
class Solution {
    static long kthDigit(int a, int b, int k) {
        // code here
        BigInteger base = BigInteger.valueOf(a);
        BigInteger result = base.pow(b);
        String num = String.valueOf(result);
        int l=num.length();
        return num.charAt(l-k)-'0';
    }
}