class Solution {
    public boolean validDigit(int n, int x) {
        
        int temp = n;

        while(temp >= 10)
        {
            temp = temp / 10;
        }

        if(temp == x)
        {
            return false;
        }

        while(n != 0)
        {
            int rem = n % 10;

            if(rem == x)
            {
                return true;
            }
            n = n / 10;
        }
        return false;
    }
}