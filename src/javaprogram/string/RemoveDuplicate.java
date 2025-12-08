package javaprogram.string;

public class RemoveDuplicate {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        boolean [] seen=new boolean[256];
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(!seen[c])
            {
                sb.append(c);
                seen[c]=true;
            }
        }
        System.out.println(sb);
    }
}
