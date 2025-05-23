/*You are required to complete this function*/
class GfG {
    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    void addFraction(int num1, int den1, int num2, int den2) {
        int den=(den1*den2)/gcd(den1,den2);
        int num=num1*(den/den1)+num2*(den/den2);
        int cf=gcd(num,den);
        num/=cf;
        den/=cf;
        System.out.println(num+"/"+den);
    }
}