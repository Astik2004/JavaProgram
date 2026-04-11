package CoreDSA.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int [] a={-1,0,1,2,-1,-4};
        Integer res=threeSum(a,1);
        System.out.println(res);

    }
    public static int threeSum(int[] nums,int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        int closest=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            int left = i + 1;
            int right = nums.length - 1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(Math.abs(target-sum)<Math.abs(target-closest)){
                    closest=sum;
                }
                if(sum>target){
                    right--;
                }
                else {
                    left++;
                }
            }

        }
        return closest;
    }
}
