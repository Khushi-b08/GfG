// User function Template for Java

class Solution {
    static List<Integer> get(int a, int b) {
        // code here
        List<Integer> li = new ArrayList<>(2);
        a=a^b;
        b=a^b;
        a=a^b;
        li.add(a);
        li.add(b);
        return li;
    }
}