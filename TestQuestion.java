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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestQuestion {

    public static void main(String[] args) {
        try {
            BufferedReader inp = new BufferedReader(
                    new InputStreamReader(System.in));
            String s1 = inp.readLine();
            String s2 = inp.readLine();

            System.out.println(longestCommonSubsequence(s1, s2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * function to return the longest common subsequence of s1 and s2
     *
     * @param s1 First string
     * @param s2 Second string
     * @return longest common subsequence of s1 and s2
     */
    public static String longestCommonSubsequence(String s1, String s2) {
        int s1Length = s1.length() - 1;
        int s2Length = s2.length() - 1;

        // check if input strings are empty
        if (s1Length < 0 || s2Length < 0) {
            return "";
        }

        /*
         * check if the two sequences both end in the same element.
         * shorten each sequence by removing the last element
         * find the LCS of the shortened sequences
         * append the removed element to that LCS 
         */
        if (s1.substring(s1Length).equals(s2.substring(s2Length))) {
            return longestCommonSubsequence(
                    s1.substring(0, s1Length), s2.substring(0, s2Length))
                    + s1.substring(s1Length);
        } else {
            String firstCommonSubsequence = longestCommonSubsequence(
                    s1, s2.substring(0, s2Length));
            String secondCommonSubsequence = longestCommonSubsequence(
                    s1.substring(0, s1Length), s2);
            if (firstCommonSubsequence.length()
                    > secondCommonSubsequence.length()) {
                return firstCommonSubsequence;
            } else {
                return secondCommonSubsequence;
            }
        }
    }
}
