package CoreDSA.array;

public class TwoSum {
    public static void main(String[] args) {
            int []a={1,4,45,6,10,8};
            int t=10;
            int[]res=twoSum(a,t);
            System.out.println(res[0]+" ,"+res[1]);
            if(isTwoSum(a,t))
            {
                System.out.println("Two Sum");
            }
            else {
                System.out.println("Not two Sum");
            }

    }
    public static  boolean isTwoSum(int [] a,int t)
    {
        for(int i=0;i<a.length;i++)
        {
            for (int j=0;j<a.length;j++)
            {
                if(a[i]+a[j]==t)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static int[] twoSum(int [] a,int t)
    {
        int l=0,r=a.length-1;
        while(l<r)
        {
            if(a[l]+a[r]==t)
            {
                return new int[]{l+1,r+1};
            }
            else if (a[l]+a[r]>t) {
                r--;
            }
            else {
                l++;
            }

        }
        return  new int[]{-1,-1};
    }
}
