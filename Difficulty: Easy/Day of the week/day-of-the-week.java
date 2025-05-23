// User function Template for Java

class Solution {
    static String getDayOfWeek(int d, int m, int y) {
        // code here
        if (m < 3) {
            m += 12;
            y--;
        }
        int k = y % 100;
        int j = y/100;
        int h = (d + 13*(m + 1)/5 + k + k/4 + j/4 + 5*j) % 7;

        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        return days[h];
    }
};