// User function Template for Java

class Solution {
    static int pairCubeCount(int n) {
        // code here
        int c=0;
        for(int i=1;i<=Math.cbrt(n);i++){
            int d= n-i*i*i;
            int diff=(int)Math.cbrt(d);
            if((diff*diff*diff)==d){
                c+=1;
            }
        }
        return c;
    }
};