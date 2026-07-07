class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");

        String[] words = paragraph.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        String ans = "";
        int max = 0;

        for (String word : words) {

            boolean isBanned = false;

            for (String b : banned) {
                if (word.equals(b)) {
                    isBanned = true;
                    break;
                }
            }

            if (!isBanned) {
                map.put(word, map.getOrDefault(word, 0) + 1);

                if (map.get(word) > max) {
                    max = map.get(word);
                    ans = word;
                }
            }
        }

        return ans;
    }
}