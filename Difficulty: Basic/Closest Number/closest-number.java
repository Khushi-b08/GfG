// User function Template for Java

class Solution {
    static int closestNumber(int n, int m) {
        // code here
        int a=n,b=n;
        while(a%m!=0){
            a+=1;
        }
        while(b%m!=0){
            b-=1;
        }
        if(Math.abs(n-a)<Math.abs(n-b)){
            return a;
        }
        else if(Math.abs(n-a)==Math.abs(n-b)){
            if(Math.abs(a)>Math.abs(b)){
                return a;
            }
            return b;
        }
        return b;
    }
};