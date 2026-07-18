class Solution {
    public int findGCD(int[] nums) {
        
        int min = nums[0];
        int max = nums[0];

        // find min and max in O(n)
       for (int i = 0; i < nums.length; i++) 
       {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
            
        }

        return gcd(min, max);
    }

    // Euclidean Algorithm
    private int gcd(int a, int b) 
    {
        while (b != 0) 
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}




/*int gcd = 1;
        Arrays.sort(nums);

        int min = (nums[0] < nums[nums.length-1])? nums[0] : nums[nums.length-1];  //largest positive integer that  divides each of the numbers without a remainder.!

        for(int i=1; i<=min; ++i)
        {
            if(nums[0]%i==0 && nums[nums.length-1]%i==0)
            {
                gcd = i;  // GCD
            }
        }
        return gcd;*/