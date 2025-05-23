/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution {
    int floorSqrt(int n) {
        // Your code here
        int l=1,h=n,mid=l+(h-l)/2,res=1;
        while(l<=h){
            mid=l+(h-l)/2;
            if(mid*mid<=n){
                res=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return res;
    }
}