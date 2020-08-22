package com.learning._341;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: ZHANG
 * @Date: 2020/8/17
 * @Description:
 */
public class NestedIterator implements Iterator<Integer> {
    LinkedList<NestedInteger> list = new LinkedList<>();

    public NestedIterator(List<NestedInteger> nestedList) {
        for (NestedInteger nestedInteger : nestedList) {
            list.add(nestedInteger);
        }
    }

    @Override
    public Integer next() {
        return list.removeFirst().getInteger();
    }

    @Override
    public boolean hasNext() {
        NestedInteger firstNestedInteger;
        while (!list.isEmpty()) {
            firstNestedInteger = list.getFirst();
            if (!firstNestedInteger.isInteger()) {
                firstNestedInteger = list.removeFirst();
                list.addAll(0, firstNestedInteger.getList());
            } else {
                return true;
            }
        }
        return false;
    }
}

interface NestedInteger {

    //    @return true if this NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger();

    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger();

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return null if this NestedInteger holds a single integer
    public List<NestedInteger> getList();
}
