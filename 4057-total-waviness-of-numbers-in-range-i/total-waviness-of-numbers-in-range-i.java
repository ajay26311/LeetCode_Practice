class Solution {
    public int totalWaviness(int num1, int num2) {
        
        int total = 0;

        for (int num = num1; num <= num2; num++) 
        {
            char[] d = String.valueOf(num).toCharArray();

            for (int i = 1; i < d.length - 1; i++) 
            {
                if ((d[i] > d[i - 1] && d[i] > d[i + 1]) ||
                    (d[i] < d[i - 1] && d[i] < d[i + 1])) {
                    total++;
                }
            }
        }

        return total;
    }
}