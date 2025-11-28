package javaprogram.program;

import java.util.Arrays;

public class TwoSum {
    static void main(String[] args) {
        int a[]={12,23,2,3,4,7};
        int t=5;
        int []res=twoSum(a,5);
        System.out.println(Arrays.toString(res));

    }
    public static int[] twoSum(int[]a,int t)
    {
        Arrays.sort(a);
       int left=0;
       int right=a.length-1;
       while(left<right)
       {
           int sum=a[left]+a[right];
           if(sum==t)
           {
               return new int[]{left,right};
           }
           else if(sum>t)
           {
               right--;
           }
           else
           {
               left++;
           }
       }
       return new int[0];
    }
}
