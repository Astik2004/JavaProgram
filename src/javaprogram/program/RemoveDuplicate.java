package javaprogram.program;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    static void main(String[] args) {
        int []a={1,1,2,2,3,3,4,5,5,6};
        removeDuplicate2(a);


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
    public static void removeDuplicate2(int[]a)
    {
        //int []a={1,1,2,2,3,3,4,5,5,6};
        int i=0;
        int j=1;
        while(j<a.length)
        {
            if(a[i]!=a[j]) {
                i++;
                a[i] = a[j];
            }
            j++;

        }
        for(int x=0;x<=i;x++)
        {
            System.out.println(a[x]);
        }
    }
}
