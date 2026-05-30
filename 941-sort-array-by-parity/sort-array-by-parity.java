class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        Arrays.sort(nums);
        int indx = 0;
        int arr[] = new int[nums.length];

        // Even 
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] % 2 == 0)
            {
                arr[indx++] = nums[i];
            }
        }

        // Odd
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] % 2 != 0)
            {
                arr[indx++] = nums[i];
            }
        }

        return arr;
    }
}