package CoreDSA.SlidingWindow;

public class SlidingWindow {
    public static void main(String[] args) {
        int arr[] = {5, 2, -1, 0, 3};
        int target = 3;
        System.out.println(getMaxSumOfSubArray1(arr,target));
    }

    private static int getMaxSumOfSubArray(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length-k;i++){
            int sum = 0;
            for(int j=0;j<k;j++)
            {
                sum=sum+arr[i+j];
            }
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }

    private static int getMaxSumOfSubArray1(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<k;i++)
        {
            sum=sum+arr[i];
        }

        maxSum = Math.max(maxSum,sum);
        for(int i=k;i<arr.length;i++)
        {
            sum=sum-arr[i-k];
            sum=sum+arr[i];
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
