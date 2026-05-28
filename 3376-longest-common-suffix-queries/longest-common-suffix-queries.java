class Solution {

    class TrieNode {
        TrieNode[] child = new TrieNode[26];

        int index;
        int len;

        TrieNode(int idx, int l) {
            index = idx;
            len = l;
        }
    }

    TrieNode root;

    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {

        int minLen = Integer.MAX_VALUE;
        int minIdx = 0;

        for (int i = 0; i < wordsContainer.length; i++) {
            if (wordsContainer[i].length() < minLen) {
                minLen = wordsContainer[i].length();
                minIdx = i;
            }
        }

        root = new TrieNode(minIdx, minLen);

        for (int i = 0; i < wordsContainer.length; i++) {
            insert(wordsContainer[i], i);
        }

        int ans[] = new int[wordsQuery.length];

        for (int i = 0; i < wordsQuery.length; i++) {
            ans[i] = search(wordsQuery[i]);
        }

        return ans;
    }

    public void insert(String word, int idx) {

        TrieNode node = root;
        int n = word.length();

        for (int i = n - 1; i >= 0; i--) {

            int ch = word.charAt(i) - 'a';

            if (node.child[ch] == null) {
                node.child[ch] = new TrieNode(idx, n);
            }

            node = node.child[ch];

            if (n < node.len) {
                node.len = n;
                node.index = idx;
            }
        }
    }

    public int search(String word) {

        TrieNode node = root;
        int n = word.length();

        for (int i = n - 1; i >= 0; i--) {

            int ch = word.charAt(i) - 'a';

            if (node.child[ch] == null) {
                break;
            }

            node = node.child[ch];
        }

        return node.index;
    }
}