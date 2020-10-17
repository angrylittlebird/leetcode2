package com.learning._123;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author: ZHANG
 * @Date: 2020/10/13
 * @Description:
 */
public class SolutionTest {

    @Test
    public void ladderLength() {
        String beginWord = "hit";
        String endWord = "cog";
        ArrayList wordList = new ArrayList(Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));

        Solution solution = new Solution();
        int i = solution.ladderLength(beginWord, endWord, wordList);
        assert i == 5;

        wordList = new ArrayList(Arrays.asList("hot", "cog", "dot", "dog", "hit", "lot", "log"));
        int i2 = solution.ladderLength(beginWord, endWord, wordList);
        assert i2 == 5;


        beginWord = "red";
        endWord = "tax";
        wordList = new ArrayList(Arrays.asList("ted", "tex", "red", "tax", "tad", "den", "rex", "pee"));
        int i3 = solution.ladderLength(beginWord, endWord, wordList);
        assert i3 == 4;
    }
}