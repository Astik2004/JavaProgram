package oodles;

public class SelectionSort {
    static void main(String[] args) {
        int [] a={12,23,34,45,8,9};
        selectionSort(a);
        for(int i:a)
        {
            System.out.println(i);
        }
    }
    public static void selectionSort(int[]a)
    {
        for(int i=0;i<a.length;i++)
        {
            int minIdx=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[minIdx]>a[j])
                {
                    minIdx=j;
                }
            }
            int t=a[minIdx];
            a[minIdx]=a[i];
            a[i]=t;
        }
    }
}
