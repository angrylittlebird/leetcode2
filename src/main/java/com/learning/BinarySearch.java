package com.learning;

import java.util.Objects;

/**
 * @Author: ZHANG
 * @Date: 2020/3/21
 * @Description: 演示正确的写算法步骤（demo：在有序数组中使用二分查找法，找到值所在的索引位置，找不到则返回-1）
 * 1.定义左边界为：left = 0，右边界：right = size - 1，当前比较的索引位置：currentIndex = left + (right-left)/2；
 * 2.left <= right,否则返回-1；
 * 3.f(currentIndex) < targetValue : left = currentIndex + 1;
 * 4.f(currentIndex) > targetValue : right = currentIndex -1;
 * 5.f(currentIndex) == targetValue : return currentIndex;
 * <p>
 * 总结：明确变量的定义，维持循环不变量，小数据集调试理解代码逻辑，大数据集测试代码性能。
 */
public class BinarySearch {

    //在区间[left,right]之间寻找
    public int findIndexNotRecursive(int targetValue, int[] arr) {
        // let exception throw here, and do not throw when use it. It will make exception more clear.
        Objects.requireNonNull(arr, "array can't be null!");

        int left = 0, right = arr.length - 1, currentIndex = left + (right - left) / 2;

        while (left <= right) {
            if (arr[currentIndex] == targetValue) return currentIndex;

            if (targetValue > arr[currentIndex]) {
                left = currentIndex + 1;
            } else {
                right = currentIndex - 1;
            }

            currentIndex = left + (right - left) / 2;
        }

        return -1;
    }

    //在区间[left,right)之间寻找,改变循环不变量的定义。
    public int findIndexNotRecursive2(int targetValue, int[] arr) {

        Objects.requireNonNull(arr, "array can't be null!");

        int left = 0, right = arr.length, currentIndex = left + (right - left) / 2;

        while (left < right) {
            if (arr[currentIndex] == targetValue) return currentIndex;

            if (targetValue > arr[currentIndex]) {
                left = currentIndex + 1;
            } else {
                right = currentIndex;
            }

            currentIndex = left + (right - left) / 2;
        }

        return -1;
    }

    public int findIndex(int targetValue, int[] arr) {
        Objects.requireNonNull(arr, "array can't be null!");

        return findIndex(0, arr.length - 1, targetValue, arr);
    }

    private int findIndex(int left, int right, int targetValue, int arr[]) {
        if (left > right) return -1;

        int currentIndex = left + (right - left) / 2;

        if (arr[currentIndex] > targetValue) {
            return findIndex(left, currentIndex - 1, targetValue, arr);
        } else if (arr[currentIndex] < targetValue) {
            return findIndex(currentIndex + 1, right, targetValue, arr);
        } else {
            return currentIndex;
        }
    }
}
