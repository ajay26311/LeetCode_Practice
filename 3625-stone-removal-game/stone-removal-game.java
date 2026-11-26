class Solution {
    public boolean canAliceWin(int n) {
     int r = 10;
     int t = 1;

        while (n >= r) {
            n -= r;
            r--;

            t++;
        }

        return t % 2 == 0;   
    }
}