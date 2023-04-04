package Week2;

import java.util.Arrays;

public class Anagram {
    static Boolean check(String str1, String str2) {
        if (str1.length() == str2.length()) {
            char[] array1 = str1.toCharArray();
            char[] array2 = str2.toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);
            if (String.valueOf(array1).equals(String.valueOf(array2))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str1 = "debit card";
        String str2 = "bad credit";
        if (check(str1, str2)) {
            System.out.println("Given Strings are anagrams");
        } else {
            System.out.println("Given Strings are not anagrams");
        }
    }
}
