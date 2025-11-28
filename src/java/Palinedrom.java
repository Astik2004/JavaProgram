package java;

public class Palinedrom {
    static void main(String[] args) {
        if(isPalindrom(122))
        {
            System.out.println("Number is Plaindrom");
        }
        else
        {
            System.out.println("Number is not plaindrome");
        }
    }
    public static boolean isPalindrom(int n)
    {
        //151
        int num=n;
        int rev=0;
        while(n>0)
        {
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }

        return rev==num;
    }
}
