class Solution {
    public int digitFrequencyScore(int n) {
        int sum = 0;
        
        while(n > 0){
            int rem = n % 10;
            sum += rem;
            n = n / 10;
        }
        return sum;
    }
}

/* int freq[] = new int[10];

        while(n > 0){
            int rem = n % 10;
                freq[rem]++;
            n = n / 10;
        }

        int score = 0;

        for(int i = 0; i < 10; i++){
            score += i * freq[i];
        }
        return score;*/