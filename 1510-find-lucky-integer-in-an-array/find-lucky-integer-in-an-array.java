class Solution {
    public int findLucky(int[] arr) {
        
        int[] freq=new int[1000];

        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }

        int max=0;

        for(int i=0;i<freq.length;i++){
            if(freq[i]==i){
                max=Math.max(max,i);
            }
        }

        if(max!=0){
            return max;
        }

        return -1;
    }
}