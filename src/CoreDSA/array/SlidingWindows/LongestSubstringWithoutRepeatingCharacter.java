package CoreDSA.array.SlidingWindows;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        String str = "abcabcbb";
        int n = str.length();
        int left=0;
        int ans=0;
        HashSet<Character> set = new HashSet<>();
        for(int right=0;right<n;right++){
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left++));
            }
            set.add(str.charAt(right));
            ans = Math.max(ans,right-left+1);
        }
        System.out.println(ans);
    }
}
