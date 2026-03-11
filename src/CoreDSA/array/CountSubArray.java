package CoreDSA.array;

public class CountSubArray {
    public static void main(String[] args) {
        int [] a={1,2,3};
        int c=countSubArray(a);
        System.out.println("count is : "+c);
    }

    private static int countSubArray(int[] a) {
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            c=c+i+1;
        }
        return c;
    }
}
