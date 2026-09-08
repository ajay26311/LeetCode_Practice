class Solution {
    public int countCommas(int n) {
        // int count = 0;
        // for(int i = 1; i <= n; i++)
        // {
        //     if(i>999){
        //         count++;
        //     }
        // }
        // return count;

        // return (n >= 1000) ? (n - 999) : 0;

        if(n<1000){
            return 0;
        }
        return n - 999;
    }
}