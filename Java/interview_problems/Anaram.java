package interview_problems;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
    Problem 1) Given two strings s and t, return true if the two strings are anagrams of each
    other, otherwise return false. An anagram is a string that contains the exact same
    characters as another string, but the order of the characters can be different.
    Example 1: Input: s = "racecar", t = "carrace" Output: true

    Problem 2) Given an integer array nums, return true if any value appears more than once in
    the array, otherwise return false.
    Example 1:
    Input: nums = [1, 2, 3, 3]
    Output: true
*/
public class Anaram {
    private static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String s = new String(s2);

        // for each char in s1 should be removed in s2, but it should only 1st instance
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            for (int j = 0; j < s.length(); j++) {
                if (c == s.charAt(j)) {
                    s = s.replaceFirst(String.valueOf(c), "");
                    break;
                }
            }
        }

        if (s.length() > 0) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "racecar";
        String s2 = "carrace";

        System.out.println(isAnagram(s1, s2));
        System.out.println(isAnagramUsingAscii(s1, s2));


        List<Integer> nums = List.of(1, 2, 3, 3);
        Set<Integer> set = nums.stream().collect(Collectors.toSet());
        if (nums.size() == set.size()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    private static boolean isAnagramUsingAscii(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count = new int[256]; // assuming ASCII
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }
}
