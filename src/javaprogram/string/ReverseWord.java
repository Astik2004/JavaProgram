package javaprogram.string;

public class ReverseWord {
    public static void main(String[] args) {
        String s="  Astik Kumar Yadav PBH                  ";
        String res="";
        String word="";
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            if(c!=' ')
            {
                word=c+word;
            }
            else {
                if (!word.isEmpty()) {
                    if(res.isEmpty())
                    {
                        res=word;
                        word="";
                    }
                    else {
                        res = res+ " " + word;
                        word = "";
                    }
                }
            }

        }
        if(!word.isBlank())
        {
            res=res+" "+word;
        }
        System.out.println(res);
    }
}
