class Solution {
    public int maxFreqSum(String s) { 
        int freq[] = new int[26];
        // frequency count
        for(char ch : s.toCharArray())
        {
           freq[ch-'a']++; 
        }

        int maxVowel = 0, maxConsonant = 0;
        //find Maximum freq
        for(int i = 0; i < 26; i++)
        {
            char ch = (char)('a'+i);
            if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
                maxVowel = Math.max(maxVowel, freq[i]);
            }
            else{
                maxConsonant = Math.max(maxConsonant, freq[i]);
            }
        }
        return maxVowel + maxConsonant;
    }
}