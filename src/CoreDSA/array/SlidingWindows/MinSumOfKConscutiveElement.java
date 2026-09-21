package CoreDSA.array.SlidingWindows;

public class MinSumOfKConscutiveElement {
    static void main(String[] args) {
        int [] a={8,2,3,4,5};
        int k=2;
        int left = 0;
        int min =Integer.MAX_VALUE;
        int sum=0;
        for(int right=0;right<a.length;right++){
            sum+=a[right];
            if(right-left+1==k){
                min=Math.min(sum,min);
                sum-=a[left];
                left++;
            }
        }
        System.out.println(min);
    }
}
