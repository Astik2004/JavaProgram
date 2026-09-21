package CoreDSA.array.SlidingWindows;

public class MaxSumOfKConscutiveElement {
    static void main(String[] args) {
        int [] a={1,2,3,4,5};
        int k=2;
        int left=0;
        int max=Integer.MIN_VALUE;
        int sum=0;

        for (int right=0;right<a.length;right++){
            sum+=a[right];
            if(right-left+1==k){
                max=Math.max(sum,max);
                sum-=a[left];
                left++;
            }
        }
        System.out.println(max);
    }
}
