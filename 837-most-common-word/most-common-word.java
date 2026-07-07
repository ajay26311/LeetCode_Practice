class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[!?',;.]", " ");
        String[] words = paragraph.split("\\s+");
        HashSet<String> ban = new HashSet<>();
        for (String b : banned) 
        {
            ban.add(b);
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) 
        {
            if (!ban.contains(word)) 
            {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        String ans = "";
        int max = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) 
        {
            if (entry.getValue() > max) 
            {
                max = entry.getValue();
                ans = entry.getKey();
            }
        }
        return ans;
    }
}