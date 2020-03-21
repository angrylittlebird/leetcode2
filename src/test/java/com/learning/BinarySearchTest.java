package com.learning;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author: ZHANG
 * @Date: 2020/3/21
 * @Description:
 */
public class BinarySearchTest {
    private BinarySearch binarySearch;
    private int[] array;
    int size = 100000;


    @Before
    public void setUp() throws Exception {
        binarySearch = new BinarySearch();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

    }

    @Test(expected = NullPointerException.class)
    public void arrayNotNull() {
        binarySearch.findIndex(10, null);
    }

    @Test
    public void findIndex() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            int index = binarySearch.findIndex(i, array);
            Assert.assertEquals(i, index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("running time:" + (endTime - startTime));

        int index = binarySearch.findIndex(11, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        Assert.assertEquals(-1, index);
    }

    @Test
    public void findIndexNotRecursize() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            int index = binarySearch.findIndexNotRecursive(i, array);
            Assert.assertEquals(i, index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("running time:" + (endTime - startTime));

        int index = binarySearch.findIndexNotRecursive(11, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        Assert.assertEquals(-1, index);
    }
}
