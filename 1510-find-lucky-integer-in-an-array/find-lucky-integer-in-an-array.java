class Solution {
    public int findLucky(int[] arr) {
        
        Arrays.sort(arr);
        int ans = -1;

        int i = 0;

        while(i < arr.length)
        {
            int count = 1;
            int num = arr[i];

            while(i + 1 < arr.length && arr[i] == arr[i + 1])
            {
                count++;
                i++;
            }

            if(count == num)
            {
                ans = num;
            }

            i++;
        }

        return ans;
    }
}