// User function Template for Java

class Solution {
    static int findNthTerm(int n) {
        // code here
        int result=1;
        for(int i=2;i<=n;i++){
            result+=i;
        }
        return result;
    }
};