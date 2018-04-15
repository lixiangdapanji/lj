package com.fxrcode;

import com.fxrcode.solutions._139;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _139Test {
    private static _139.Solution1 sol1;
    private static _139.Solution2 sol2;
    private static String s;
    private static List<String> wordDict;

    @BeforeClass
    public static void setup() {
        sol1 = new _139.Solution1();
        sol2 = new _139.Solution2();
    }

    @Test
    public void test1() {
        s = "leetcode";
        wordDict = new ArrayList<>(Arrays.asList("leet", "code"));
        assertEquals(true, sol2.wordBreak(s, wordDict));
    }

    @Test
    public void test2() {
        s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        wordDict = new ArrayList<>(Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"));
        assertEquals(true, sol2.wordBreak(s, wordDict));
    }
}
