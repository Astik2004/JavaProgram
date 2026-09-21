package CoreDSA.array.SlidingWindows;

public class AverageOfEverySubarrayOfSizeK {
    static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        int k=3;
        int left=0;
        int sum=0;

        for(int right=0;right<a.length;right++)
        {
            sum+=a[right];

            if(right-left+1==k)
            {
                int avg=sum/k;
                System.out.println(avg);
                sum -=a[left];
                left++;
            }
        }
    }
}
