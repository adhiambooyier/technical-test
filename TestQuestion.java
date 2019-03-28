/*
*  Adhiambo Oyier Peres
*
*
*   Write a function that takes two strings, s1 and s2 and returns the longest common subsequence of s1 and s2.
*   1. Longest common subsequence refers to the longest sequence of characters that appear in both strings
*   2. The characters are case sensitive
*   3. Do not worry about code performance or optimizing
*   4. Its advisable to come up with test cases in pseudocode or just English
*   5. The order of the characters must be maintained
 */
package javasamples;

import java.util.ArrayList;
import java.util.List;

public class TestQuestion {

    public static void main(String[] args) {
        String s1 = "ABOUT";
        String s2 = "BOAT";

        System.out.println(longestCommonSubsequence(s1, s2));
    }

    // generate common subsequences in both strings
    private static List<String> commonSubsequences(String[] arr1, String[] arr2) {
        List<String> commonSubsequences = new ArrayList<>();
   

        return commonSubsequences;
    }
    public static String longestCommonSubsequence(String a, String b) {
        int alength = a.length() - 1;
        int blength = b.length() - 1;

        if (alength < 0 || blength < 0)
            return "";

        if (a.substring(alength).equals(b.substring(blength))) {
            return longestCommonSubsequence(a.substring(0, alength), b.substring(0, blength))
                    + a.substring(alength);
        } else {
            String first = longestCommonSubsequence(a, b.substring(0, blength));
            String second = longestCommonSubsequence(a.substring(0, alength), b);
            if (first.length() > second.length()) {
                return first;
            } else {
                return second;
            }
        }
    }
}
