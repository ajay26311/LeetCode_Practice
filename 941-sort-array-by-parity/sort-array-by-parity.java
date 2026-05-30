class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) 
        {
            if (nums[left] % 2 == 0) 
            {
                left++;
            }
            else if (nums[right] % 2 == 1) 
            {
                right--;
            }
            else 
            {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }

        return nums;  
    }
}

/*  Arrays.sort(nums);
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

        return arr;*/