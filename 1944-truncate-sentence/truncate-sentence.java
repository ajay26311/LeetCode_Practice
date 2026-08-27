class Solution {
    public String truncateSentence(String s, int k) {
        
        String words[] = s.trim().split("\\s+");
        String res ="";

        for(int i = 0; i < k; i++)
        {
            res = res + words[i];

            if(i < k - 1)
            {
                res = res +" ";
            }
        }
        return res;
    }
}