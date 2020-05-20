package com.learning._219;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @Author: ZHANG
 * @Date: 2020/5/18
 * @Description:
 */
public class SolutionTest {

    @Test
    public void containsNearbyDuplicate() {
        Solution solution = new Solution();
        boolean b = solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3);
        assertTrue(b);

        b = solution.containsNearbyDuplicate(new int[]{}, 0);
        assertFalse(b);

        b = solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 0);
        assertFalse(b);
    }
}