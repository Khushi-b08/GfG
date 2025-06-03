class Solution {
    int countPairs(int[][] mat1, int[][] mat2, int x) {
        // code here
        int n = mat1.length;

        int[] flat1 = new int[n * n];
        int[] flat2 = new int[n * n];

        int ind = 0;
        for (int[] row : mat1) {
            for (int val : row) {
                flat1[ind++] = val;
            }
        }

        int indx = 0;
        for (int[] row : mat2) {
            for (int val : row) {
                flat2[indx++] = val;
            }
        }

        Arrays.sort(flat1);
        Arrays.sort(flat2);

        int i = 0, j = flat2.length - 1;
        int count = 0;

        while (i < flat1.length && j >= 0) {
            int sum = flat1[i] + flat2[j];
            if (sum == x) {
                count++;
                i++;
                j--;
            } else if (sum < x) {
                i++;
            } else {
                j--;
            }
        }

        return count;
}
}