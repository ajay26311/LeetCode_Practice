class Solution {
    public boolean checkDivisibility(int n) {
        
        int sum = 0, pro = 1, temp = n;

        while(n != 0)
        {
            int rem = n % 10;    // 9
                sum = sum + rem; 
                pro = pro * rem;
                n = n / 10;
        }
        int res = sum + pro;

        return temp % res == 0;
    }
}