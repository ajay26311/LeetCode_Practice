class Solution {
    public String oddString(String[] words) {
        int n = words.length;

        int[] first = getDifference(words[0]);
        int[] second = getDifference(words[1]);
        int[] third = getDifference(words[2]);

        // First two are different
        if (!Arrays.equals(first, second)) {

            if (Arrays.equals(first, third)) {
                return words[1];
            }

            return words[0];
        }

        // First two are same
        for (int i = 2; i < n; i++) {

            int[] current = getDifference(words[i]);

            if (!Arrays.equals(first, current)) {
                return words[i];
            }
        }

        return "";
    }

    public int[] getDifference(String word) {

        int[] diff = new int[word.length() - 1];

        for (int i = 0; i < word.length() - 1; i++) {

            diff[i] = word.charAt(i + 1)
                       - word.charAt(i);
        }

        return diff;
    }
}