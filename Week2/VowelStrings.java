package Week2;

public class VowelStrings {
    public static boolean isVowel(char c) {
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }

    public static int vowelStrings(String[] words, int left, int right) {
        int cnt = 0;
        for(int i = left; i <= right; i++) {
            String s = words[i];
            if(isVowel(s.charAt(0)) && isVowel(s.charAt(s.length() - 1)))
                cnt++;
        }
        return cnt;
    }   

    public static void main(String[] args) {
        String[] words = {"hey","aeo","mu","ooo","artro"};
        int left = 1;
        int right = 4;
        System.out.println(vowelStrings(words, left, right));
    }
}
