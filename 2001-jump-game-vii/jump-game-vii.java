class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);

        int farthest = 0;

        while (!q.isEmpty()) {
            int current = q.poll();

            int start = Math.max(current + minJump, farthest + 1);
            int end = Math.min(current + maxJump, s.length() - 1);

            for (int i = start; i <= end; i++) {
                if (s.charAt(i) == '0') {
                    if (i == s.length() - 1) {
                        return true;
                    }
                    q.offer(i);
                }
            }

            farthest = end;
        }

        return s.length() == 1;
    }
}