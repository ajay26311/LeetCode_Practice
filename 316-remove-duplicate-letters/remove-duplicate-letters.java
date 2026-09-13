class Solution {
    public String removeDuplicateLetters(String s) {
        int[] count = new int[26];
        boolean[] used = new boolean[26];

        // Count frequency
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        StringBuilder stack = new StringBuilder();

        for (char c : s.toCharArray()) {

            // Current character is no longer remaining
            count[c - 'a']--;

            // Already present → skip
            if (used[c - 'a']) {
                continue;
            }

            // Remove larger characters if they appear later
            while (stack.length() > 0 &&
                   stack.charAt(stack.length() - 1) > c &&
                   count[stack.charAt(stack.length() - 1) - 'a'] > 0) {

                char removed = stack.charAt(stack.length() - 1);
                stack.deleteCharAt(stack.length() - 1);

                used[removed - 'a'] = false;
            }

            // Add current character
            stack.append(c);
            used[c - 'a'] = true;
        }

        return stack.toString();
    }
}