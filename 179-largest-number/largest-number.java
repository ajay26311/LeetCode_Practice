class Solution {
    public String largestNumber(int[] nums) {
         String[] arr = new String[nums.length];

        // Convert int → String
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Custom sorting
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // If largest number is 0
        if (arr[0].equals("0")) {
            return "0";
        }

        // Build answer
        StringBuilder sb = new StringBuilder();

        for (String s : arr) {
            sb.append(s);
        }

        return sb.toString();
    }
}