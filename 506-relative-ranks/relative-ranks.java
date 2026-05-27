class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        int max = 0;

        for(int s : score)
        {
            max = Math.max(max, s);
        }

        int rank[] = new int[max + 1];

        for(int s : score)
        {
            rank[s] = 1;
        }

        int position = 1;

        for(int i = max; i >= 0; i--)
        {
            if(rank[i] == 1)
            {
                rank[i] = position++;
            }
        }

        String words[] = new String[score.length];

        for(int i = 0; i < score.length; i++)
        {
            int r = rank[score[i]];

            if(r == 1)
            {
                words[i] = "Gold Medal";
            }
            else if(r == 2)
            {
                words[i] = "Silver Medal";
            }
            else if(r == 3)
            {
                words[i] = "Bronze Medal";
            }
            else
            {
                words[i] = String.valueOf(r);
            }
        }

        return words;
    }
}