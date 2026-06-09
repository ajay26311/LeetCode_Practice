class Solution {
    public int alternateDigitSum(int n) {
        
        int sum = 0;
        int count = 0;
        int temp = n;

        while(temp != 0)
        {
            temp = temp / 10;
            count++;
        }
    
        temp = n;

        while(temp != 0)
        {
            int rem = temp % 10;

            if(count % 2 == 0)  // start from negative
            {
                sum = sum - rem;
                count--;
            }
            else
            {
                sum = sum + rem;  // positive 
                count--;
            }
            temp = temp / 10;
        }
        return sum;
    }
}