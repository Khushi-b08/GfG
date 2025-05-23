// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int c=0,x=n,y=n,sum=0,r;
        while(x>0){
            c+=1;
            x/=10;
        }
        while(y>0){
            r=y%10;
            sum+=Math.pow(r,c);
            y/=10;
        }
        if(sum==n){
            return true;
        }
        else{
            return false;
        }
    }
}