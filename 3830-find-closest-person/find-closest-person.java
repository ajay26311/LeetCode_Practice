class Solution {
    public int findClosest(int x, int y, int z) {
        
        int n1 = Math.abs(x - z);  // 4
        int n2 = Math.abs(y - z);  // 1

        if(n1 > n2)
        {
            return 2;
        }
        else if(n1 < n2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}