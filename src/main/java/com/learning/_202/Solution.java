package com.learning._202;

import java.util.HashSet;

/**
 * @Author: ZHANG
 * @Date: 2020/5/9
 * @Description: Write an algorithm to determine if a number n is "happy".
 * <p>
 * A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 * <p>
 * Return True if n is a happy number, and False if not.
 * <p>
 * Example: 
 * <p>
 * Input: 19
 * Output: true
 * Explanation:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/happy-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

//证明为什么happy方法不会一直变大一个数字
// 999 ->  243
// 9999 -> 324
// 已知数字A在位数限定的情况下通过happy方法想要获得一个最大的数B，那么数A每一位都需要是9，
// 当数字A是4位数时，最理想的情况下也会下跌至3位数；而3位数时最理想的情况也会变小至243，因而数字不会一直变大。
public class Solution {
    //    ArrayList<Integer> res = new ArrayList<>();
    HashSet<Integer> res = new HashSet<>();

    public boolean isHappy(int n) {
        if (n == 1) return true;

        int sum = 0;
        while (n != 0) {
            int i = n % 10;
            sum += i * i;
            n /= 10;
        }

        if (res.contains(sum)) return false;

        res.add(sum);
        return isHappy(sum);
    }
}
