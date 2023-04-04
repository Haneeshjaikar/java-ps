package Week2;

public class Palindrome {
    static Boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while(i < j) {
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }


public static void main(String[] args) {
    String s = "abba";
    if(isPalindrome(s)){
        System.out.println("Given String is a Palindrome");
    }
    else{
        System.out.println("Given String is not a Palindrome");
    }
}

}