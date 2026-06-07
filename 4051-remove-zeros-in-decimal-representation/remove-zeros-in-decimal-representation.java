class Solution {
    public long removeZeros(long n) {
        
        long res = 0;
        long place = 1;

        while(n > 0)  // 1020030
        {
            long rem = n % 10;   // 123

            if(rem != 0)
            {
                res = res + rem * place;
                place *= 10;
            }

            n = n / 10;
        }
        return res;
    }
}