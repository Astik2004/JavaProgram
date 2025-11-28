package java;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    static void main(String[] args) {
        int []a={1,1,1,2,3,4,5,6,76,5,43,3};
        int []res=removeDuplicate(a);
        for(int i:res)
        {
            System.out.println(i);
        }

    }
    public static int[] removeDuplicate(int[]a)
    {
        Set<Integer> s=new LinkedHashSet<>();
        for(int i:a)
        {
            s.add(i);
        }
        int []res=new int[s.size()];
        int ind=0;
        for(int i:s)
        {
            res[ind]=i;
            ind++;
        }
        return res;
    }
}
