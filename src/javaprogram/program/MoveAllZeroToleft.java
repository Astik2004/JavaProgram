package javaprogram.program;

public class MoveAllZeroToleft {
    public static void main(String[] args) {
        String s="a#bcde#def#";
        char [] arr=s.toCharArray();
        int left=0;
        int n=arr.length;
        int t=-1;
        while(left<n)
        {
            if(arr[left]=='#')
            {
                t++;
                char temp=arr[left];
                arr[left]=arr[t];
                arr[t]=temp;
                left++;
            }
            else {
                left++;
            }
        }
        System.out.println(arr);
    }
}
