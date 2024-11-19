package Recursion;

import java.util.Arrays;

public class Q3_Medium_Recursion {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        reverseArray(arr);
        System.out.println("Reversed array =" + Arrays.toString(arr));
        String str = "madam";
        boolean isPalindrome = palindrome(str);
        System.out.println(str + (isPalindrome ? " is palindrome" : "is not palindrome"));
    }

    public static void reverseArray(int[] arr) {
        int n = arr.length;
        recursiveReverse(arr, 0, n - 1);
    }

    public static void recursiveReverse(int[] arr, int start, int end) {
        if (start >= end)
            return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        recursiveReverse(arr, start + 1, end - 1);
    }

    public static boolean palindrome(String str) {
        int n = str.length();
        boolean ans = recursivePalindrome(str, 0, n - 1);
        return ans;
    }

    public static boolean recursivePalindrome(String str, int start, int end) {
        if (start >= end)
            return true;
        char startch = str.charAt(start);
        char endch = str.charAt(end);
        if (startch != endch)
            return false;
        return recursivePalindrome(str, start + 1, end - 1);
    }
}
