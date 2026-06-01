class Solution {
    public int minimumCost(int[] cost) {

        Arrays.sort(cost);

        int ans = 0;

        for (int i = cost.length - 1; i >= 0; i -= 3) 
        {
            ans += cost[i]; // most expensive

            if (i - 1 >= 0)
                ans += cost[i - 1]; // second most expensive
            // i-2 candy is free
        }

        return ans;
    }
}