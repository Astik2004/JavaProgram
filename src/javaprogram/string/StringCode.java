package javaprogram.string;

import java.util.HashSet;

public class StringCode {
    public static void main(String[] args) {
        String s = "Python is programming language";
        String vowels = "AaEeIiOoUu";
        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (char c : s.toCharArray()) {
            if(c==' ')
            {
                sb.append(c);
            }
            if (vowels.indexOf(c) != -1)
                continue; // skip vowels

            if (!seen.contains(c)) {
                if(c>='A' && c<='Z')
                {
                    c=(char) (c+32);
                }
                sb.append(c);
                seen.add(c);
            }
        }
        System.out.println(sb.toString());
    }
}
