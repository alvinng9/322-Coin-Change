package org.example;

import java.util.Arrays;

public class Solution {
    public int coinChange(int[] coins, int amount) {
        //initialize the dynamic programming array
        int[] result = new int[amount + 1];
        //set all the indexes to 99999 except the base case at index 0
        Arrays.fill(result, amount + 1);
        result[0] = 0;

        //finding the least number of count from 1 to the given amount
        for (int i = 1; i <= amount; i++) {
            //check each coin case
            for (int c : coins) {
                //check if the current amount subtracts the coin is bigger than 0
                if (i - c >= 0) {
                    //find the least amount of coins needed
                    result[i] = Math.min(result[i], result[i - c] + 1);
                }
            }
        }
        //if the value of the last index is 99999, it indicates that the given coins
        //cannot make up the amount
        //if the value of the last index is not 99999, returns the value at that index
        return result[amount] == amount + 1 ? -1 : result[amount];
    }
}
