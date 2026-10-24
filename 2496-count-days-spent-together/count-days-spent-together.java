class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int[] prefix = new int[13];

        for (int i = 1; i <= 12; i++) {
            prefix[i] = prefix[i - 1] + days[i - 1];
        }

        int startAlice = convert(arriveAlice, prefix);
        int endAlice = convert(leaveAlice, prefix);
        int startBob = convert(arriveBob, prefix);
        int endBob = convert(leaveBob, prefix);

        int start = Math.max(startAlice, startBob);
        int end = Math.min(endAlice, endBob);

        return Math.max(0, end - start + 1);
    }

    private int convert(String date, int[] prefix) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));

        return prefix[month - 1] + day;
    }
}