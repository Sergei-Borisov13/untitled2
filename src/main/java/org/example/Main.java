package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        reverse(nums);
        System.out.println(Arrays.toString(nums));
        for (String testStr : Arrays.asList("аргентина манит негра")) {
            System.out.println("testing " + testStr + " is palindrome=" + isPalindrome(testStr));
        }

    }
    public static void reverse (int[] nums)
    {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[nums.length - 1 - i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }
    public static boolean isPalindrome(String str) {
        return IntStream.range(0, str.length() / 2)
                .noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));
    }
}
