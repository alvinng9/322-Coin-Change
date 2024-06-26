package org.example;

import java.util.Arrays;

public class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] result = new int[amount + 1];
        Arrays.fill(result, amount + 1);
        result[0] = 0;
        for (int i = 1; i < amount + 1; i++) {
            for (int c : coins) {
                if (i - c >= 0) {
                    result[i] = Math.min(result[i], Math.max(0, result[i - c] + 1));
                }
            }
        }
        return (result[result.length - 1] == amount + 1) ? -1 : result[result.length - 1];
    }
}
