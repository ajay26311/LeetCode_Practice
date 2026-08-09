class Solution {
    public int[] numberOfPairs(int[] nums) {
        int arr[]=new int[101];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
           int pairs = 0;
        int remaining = 0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i]>= 2) {
                pairs+= arr[i] / 2;
                remaining+= arr[i] % 2;
            } 
            else if (arr[i]==1) {
                remaining++;
            }
        }
        return new int[]{pairs,remaining};
    }
}