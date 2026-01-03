package CoreDSA.array;

public class SndMaxInArray {
    public static void main(String[] args) {
        int[] a = {1, 4, 45,45, 6, 10, 8};
        int sm=findSecondMax(a);
        System.out.println(sm);
    }

    private static int findSecondMax(int[] a) {
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                smax=max;
                max=a[i];
            } else if (a[i]<max && a[i]>smax) {
                smax=a[i];
            }
        }
        return smax;
    }
}
