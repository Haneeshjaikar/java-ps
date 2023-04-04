package Week2;

public class ReverseString {
    static String reverse(char[] str) {
        int len = str.length;
        int x = 0;
        while (x < len / 2) {
            str[x] ^= str[len - 1 - x];
            str[len - 1 - x] ^= str[x];
            str[x] ^= str[len - 1 - x];
            x++;
        }
        return String.valueOf(str);
    }

    public static void main(String[] args) {
        String s = "Reversing String without using extra memory";
        System.out.println(reverse(s.toCharArray()));
    }
}
