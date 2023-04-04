package Week2;

import java.util.*;

public class MatchingSubsequences {
        static private List<List<Integer>> pos;
        private static boolean isMatch(String word) {
          int l = -1;
          for (char c : word.toCharArray()) {
            List<Integer> p = pos.get(c);
            int index = Collections.binarySearch(p, l + 1);
            if (index < 0) index = -index - 1;
            if (index >= p.size()) return false;
            l = p.get(index);
          }
          return true;
        }
        
        public static int numMatchingSubseq(String S, String[] words) {
          pos = new ArrayList<>();
          for (int i = 0; i < 128; ++i) 
            pos.add(new ArrayList<Integer>());
          char[] s = S.toCharArray();
          for (int i = 0; i < s.length; ++i)
            pos.get(s[i]).add(i);
          int ans = 0;
          for (String word : words)
            if (isMatch(word)) ++ans;
          return ans;
        }

        public static void main(String[] args) {
            String[] words = {"a","bb","acd","ace", "acde"};
            String s = "abcde";
            System.out.println(numMatchingSubseq(s, words));
        }
}
