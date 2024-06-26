package org.example;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void coinChangeTest() {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.coinChange(new int[]{1,2,5}, 11));
        Assert.assertEquals(-1, solution.coinChange(new int[]{2}, 3));
        Assert.assertEquals(0, solution.coinChange(new int[]{1}, 0));
    }

}