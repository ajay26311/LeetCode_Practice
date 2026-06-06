class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int lsum = 0, rsum = 0;

        int leftSum[] = new int[nums.length];
        int rightSum[] = new int[nums.length];
        int res[] = new int[nums.length];

        // left sum
        for(int i = 0; i < nums.length; i++)
        {
            leftSum[i] = lsum;
            lsum = lsum + nums[i];
        }

        // right sum
        for(int i = nums.length-1; i >= 0; i--)
        {
            rightSum[i] = rsum;
            rsum = rsum + nums[i];
        }

        for(int i = 0; i < nums.length; i++)
        {
            res[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return res;
    }
}