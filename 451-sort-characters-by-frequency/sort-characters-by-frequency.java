class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        List<Character> chars = new ArrayList<>(freq.keySet());

        chars.sort((a, b) -> freq.get(b) - freq.get(a));

        StringBuilder res = new StringBuilder();

        for (char ch : chars) {
            for (int i = 0; i < freq.get(ch); i++) {
                res.append(ch);
            }
        }

        return res.toString();
    }
}

/*
int[] freq = new int[65536];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (freq[arr[i]] < freq[arr[j]]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return new String(arr);
 */