package CoreDSA.stringcode;

import java.util.*;

public class AnagramCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String: "  );
        String firstString = sc.nextLine();
        System.out.println("Enter the second String: "  );
        String secondString = sc.nextLine();
        if(isAnagram(firstString,secondString)){
            System.out.println("Anagram found");
        }
        else{
            System.out.println("Not Anagram");
        }

        String [] str={"ate","tea","abc","bca","cba","bc","cd"};
        System.out.println(getListAnagrams(str));

    }
    private static boolean isAnagram(String firstString, String secondString) {
        if(firstString.length() != secondString.length())
            return false;

        int[] f=new int[26];
        for(int i=0;i<firstString.length();i++)
        {
            f[firstString.charAt(i)-'a']++;
            f[secondString.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(f[i]!=0)
                return false;
        }
        return true;
    }

    private static List<List<String>> getListAnagrams(String[] str) {
        if(str.length==0 || str==null) return new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for(String s:str){
            int []f=new int[26];
            for(char c:s.toCharArray())
            {
                f[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i:f)
            {
                sb.append(i);
            }
            String key=sb.toString();
            if(!map.containsKey(key))
                map.put(key,new ArrayList<>());

            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
