import java.util.*;

class Solution {

    class Fenwick {
        int n;
        int[] bit;

        Fenwick(int n) {
            this.n = n;
            bit = new int[n + 2];
        }

        void update(int idx, int val) {
            while (idx <= n) {
                bit[idx] = Math.max(bit[idx], val);
                idx += idx & -idx;
            }
        }

        int query(int idx) {
            int res = 0;
            while (idx > 0) {
                res = Math.max(res, bit[idx]);
                idx -= idx & -idx;
            }
            return res;
        }
    }

    public List<Boolean> getResults(int[][] queries) {

        int MAX = 50005;

        TreeSet<Integer> obstacles = new TreeSet<>();
        obstacles.add(0);
        obstacles.add(MAX);

        for (int[] q : queries) {
            if (q[0] == 1) {
                obstacles.add(q[1]);
            }
        }

        Fenwick bit = new Fenwick(MAX + 2);

        Integer prev = null;
        for (int p : obstacles) {
            if (prev != null) {
                bit.update(p, p - prev);
            }
            prev = p;
        }

        List<Boolean> ans = new ArrayList<>();

        for (int i = queries.length - 1; i >= 0; i--) {

            int[] q = queries[i];

            if (q[0] == 2) {

                int x = q[1];
                int sz = q[2];

                Integer pre = obstacles.floor(x);

                int maxGapBefore = bit.query(pre);
                int tailGap = x - pre;

                ans.add(Math.max(maxGapBefore, tailGap) >= sz);

            } else {

                int pos = q[1];

                int left = obstacles.lower(pos);
                int right = obstacles.higher(pos);

                obstacles.remove(pos);

                bit.update(right, right - left);
            }
        }

        Collections.reverse(ans);
        return ans;
    }
}