package javaprogram.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int []a={12,23,11,8,9,25};
        sortI(a);
        System.out.println(Arrays.toString(a));
    }

    private static void sortI(int[] a) {
        for(int i=1;i<a.length;i++)
        {
            int key=a[i];
            int j=i-1;
            while(j>=0 && key<a[j])
            {
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=key;
        }
    }
}
