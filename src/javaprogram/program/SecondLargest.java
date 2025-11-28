package javaprogram.program;

public class SecondLargest {
    static void main(String[] args) {
        int[] a={12,13,11,12,12,13};
        System.out.println(secondLargest(a));
    }
    public static int secondLargest(int[]a)
    {
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(max<a[i])
            {
                smax=max;
                max=a[i];
            } else if (a[i]>smax && a[i]!=max) {
                smax=a[i];
            }
        }
        return smax;
    }
}
