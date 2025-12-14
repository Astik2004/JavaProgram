package javaprogram.program;

import java.util.Arrays;

public class MoveAllZeroToleft {
    public static void main(String[] args) {
//        String s="a#bcde#def#";
//        char [] arr=s.toCharArray();
//        int left=0;
//        int n=arr.length;
//        int t=-1;
//        while(left<n)
//        {
//            if(arr[left]=='#')
//            {
//                t++;
//                char temp=arr[left];
//                arr[left]=arr[t];
//                arr[t]=temp;
//                left++;
//            }
//            else {
//                left++;
//            }
//        }
//        System.out.println(arr);
        int [] a={1,0,2,3,0,4,0};
        int s=0;
        int i=0;
        while(i<a.length)
        {
            if(a[i]!=0)
            {
                int t=a[i];
                a[i]=a[s];
                a[s]=t;
                s++;
                i++;
            }
            else
            {
                i++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
