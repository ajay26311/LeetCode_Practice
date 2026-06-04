class Solution {
    public int subtractProductAndSum(int n) {
        
        int rem = 0, sum = 0, pro = 1;

        while(n != 0)
        {
            rem = n % 10;    // 4
            pro = pro * rem;  
            sum = sum + rem;
            n = n / 10;
        }

        return  pro - sum;
    }
}