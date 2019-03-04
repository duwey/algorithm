package cn.duwey.algorithm.leetcode;

/**
 * 爬楼梯问题，如果每次能爬1或2级台阶，那么爬到N级台阶有多少种走法。 斐波那契数列：F(n) = F(n - 1) + F(n - 2)
 */
public class Solution070 {

    /**
     * 动态规划解法，每次迭代过程中，只需要保留之前的两个状态，就可以推导出新的状态，不需要保留所有的子状态
     */
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int x = 1;
        int y = 2;
        int res = 0;
        for (int i = 3; i <= n; i++) {
            res = x + y;
            x = y;
            y = res;
        }
        return res;
    }

}


