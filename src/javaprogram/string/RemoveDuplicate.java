package javaprogram.string;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s="Astik kumar yadav";
        StringBuilder sb=new StringBuilder();
        boolean [] seen=new boolean[256];
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c==' ')
            {
                sb.append(c);
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
