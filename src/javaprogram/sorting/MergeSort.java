package javaprogram.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] a={6,2,5,3,8,1,4};
        int left=0;
        int right=a.length-1;
        mergeSort(a,left,right);
        System.out.println(Arrays.toString(a));
    }
    public static void mergeSort(int[] a,int left,int right)
    {
        if(left<right)
        {
            int mid=left+(right-left)/2;
            mergeSort(a,left,mid);
            mergeSort(a,mid+1,right);
            mergeArray(a,left,mid,right);
        }
    }

    public static void mergeArray(int[] a, int left, int mid, int right) {
        int [] res=new int[right-left+1];
        int ind1=left;
        int ind2=mid+1;
        int x=0;
        while(ind1<=mid && ind2<=right)
        {
            if(a[ind1]<a[ind2])
            {
                res[x++]=a[ind1++];
            }
            else {
                res[x++]=a[ind2++];
            }
        }
        while(ind1<=mid)
        {
            res[x++]=a[ind1++];
        }
        while(ind2<=right)
        {
            res[x++]=a[ind2++];
        }

        for(int i=0;i<res.length;i++)
        {
            a[left+i]=res[i];
        }
    }
}
