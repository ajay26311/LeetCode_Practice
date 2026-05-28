class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int freq[] = new int[10];

        for(int i = 0; i < nums.length; i++)
        {
            int count = 0;
            
            if(i > 0 && nums[i] == nums[i-1])
            {
                continue;
            }

            for(int j = i; j < nums.length; j++)
            {
                if(nums[i] == nums[j])
                {
                    count++;
                }
            }
            if(count == 1)
            {
                return nums[i];
            }
        }
        return 0;
    }
}