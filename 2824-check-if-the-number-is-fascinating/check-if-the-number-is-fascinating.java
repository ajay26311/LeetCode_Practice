class Solution {
    public boolean isFascinating(int n) {
        
        String str1 = String.valueOf(2 * n);
        String str2 = String.valueOf(3 * n);
        String str = String.valueOf(n);

        String res = str+str1+str2;

        int freq[] = new int[10];

         // frequency calculate
        for(int i = 0; i < res.length(); i++)
        {
            char ch = res.charAt(i);

            if(ch == '0')
                return false;

            freq[ch - '0']++;
        }

        for(int i = 1; i <= 9; i++) 
        {
            if(freq[i] != 1)
                return false;
        }
        return true;  
    }
}