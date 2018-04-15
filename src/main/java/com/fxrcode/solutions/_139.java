package com.fxrcode.solutions;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be segmented into a space-separated sequence of one or more dictionary words. You may assume the dictionary does not contain duplicate words.
 *
 * For example, given
 * s = "leetcode",
 * dict = ["leet", "code"].
 *
 * Return true because "leetcode" can be segmented as "leet code".
 *
 * UPDATE (2017/1/4):
 * The wordDict parameter had been changed to a list of strings (instead of a set of strings). Please reload the code definition to get the latest changes.
 */
public class _139 {

    /**
     * Brute force Recursion and Backtracking. TLE
     */
    public static class Solution1 {
        public boolean wordBreak(String s, List<String> wordDict) {
            return dfs(s, new HashSet(wordDict), 0);
        }

        private boolean dfs(String s, Set<String> Dict, int start) {
            if (start == s.length()) {
                return true;
            }
            for (int end = start+1; end <= s.length(); ++end) {
                if (Dict.contains(s.substring(start, end)) && dfs(s, Dict, end)) {
//                    System.out.println("Matched:" + s.substring(start, end) + " [" + start + ", " + end+"]");
//                    return dfs(s, Dict, end);
                    return true;
                }
            }
            return false;
        }
    }

    public static class Solution2 {
        public boolean wordBreak(String s, List<String> wordDict) {
            return word_Break(s, new HashSet(wordDict), 0, new Boolean[s.length()]);
        }
        private boolean word_Break(String s, Set<String> wordDict, int start, Boolean[] memo) {
            if (start == s.length()) {
                return true;
            }
            if (memo[start] != null) {
                return memo[start];
            }
            for (int end = start + 1; end <= s.length(); end++) {
                if (wordDict.contains(s.substring(start, end)) && word_Break(s, wordDict, end, memo)) {
                    return memo[start] = true;
                }
            }
            return memo[start] = false;
        }
    }
}
