// User function Template for Java
class Solution {
    static int sumOfDigits(int n) {
        // code here
        int r,sum=0;
        while(n>0){
            r=n%10;
            sum+=r;
            n/=10;
        }
        return sum;
    }
}
