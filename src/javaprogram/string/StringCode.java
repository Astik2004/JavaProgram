package javaprogram.string;

public class StringCode {
    public static void main(String[] args) {
        String s="Python is programming language";
        String v="AaEeIiOoUu";
        StringBuilder sb=new StringBuilder();
        boolean [] seen=new boolean[256];
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(v.indexOf(c)!=-1)
            {
                continue;
            }
            if(!seen[c])
            {
                sb.append(c);
                seen[c]=true;
            }
        }
        System.out.println(sb);
    }
}
