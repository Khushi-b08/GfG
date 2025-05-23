
class Solution {
    public static ArrayList<String> fizzBuzz(int n) {
        // code here
        ArrayList<String> a = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0){
                if(i%5==0){
                    a.add("FizzBuzz");
                    continue;
                }
                else{
                    a.add("Fizz");
                }
            }
            else if(i%5==0){
                if(i%3==0){
                    a.add("FizzBuzz");
                    continue;
                }
                else{
                    a.add("Buzz");
                }
            }
            else{
                a.add(String.valueOf(i));
            }
        }
        return a;
    }
}
