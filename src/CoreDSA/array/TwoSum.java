package CoreDSA.array;

public class TwoSum {
    public static void main(String[] args) {
            int []a={1,4,45,6,10,8};
            int t=16;
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
}
