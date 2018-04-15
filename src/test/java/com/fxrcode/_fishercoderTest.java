package com.fxrcode;

import com.fxrcode.solutions.fishercoder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class _fishercoderTest {
    private static fishercoder.Solution2 solution2;
    private static String s;
    private static List<String> wordDict;

    @BeforeClass
    public static void setup() {
        solution2 = new fishercoder.Solution2();
    }

    @Test
    public void test1() {
        s = "leetcode";
        wordDict = new ArrayList<>(Arrays.asList("leet", "code"));
        assertEquals(true, solution2.wordBreak(s, wordDict));
    }
}