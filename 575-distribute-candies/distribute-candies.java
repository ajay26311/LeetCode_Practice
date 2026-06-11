class Solution {
    public int distributeCandies(int[] candyType) {

        Arrays.sort(candyType);

        int uniqueCandy = 1;

        for(int i = 1; i < candyType.length; i++)
        { 
            if(candyType[i] != candyType[i-1])
            {
                uniqueCandy++;
            }
        }

        return Math.min(uniqueCandy, candyType.length / 2);
    }
}