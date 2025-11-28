package java.sorting;

import java.util.Arrays;

public class SelectionSort {
    static void main(String[] args) {
        int []a={12,23,11,8,9,25};
        sortS(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sortS(int[]a)
    {
        for(int i=0;i<a.length;i++)
        {
            int mind=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[mind])
                {
                    mind=j;
                }
            }
            int t=a[mind];
            a[mind]=a[i];
            a[i]=t;
        }
    }
}
