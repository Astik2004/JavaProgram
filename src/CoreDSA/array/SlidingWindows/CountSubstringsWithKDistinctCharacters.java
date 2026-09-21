package CoreDSA.array.SlidingWindows;

public class CountSubstringsWithKDistinctCharacters {
    static void main(String[] args) {
        String str = "abc";
        int k=2;
        int left=0;
        int ans=0;
        int distinct=0;
        int [] f=new int [26];
        for(int right=0;right<str.length();right++){
            f[str.charAt(right)-'a']++;
            if(f[str.charAt(right)-'a']==1){
                distinct++;
            }
            while(distinct>k){
                f[str.charAt(left)-'a']--;
                if(f[str.charAt(left)-'a']==0){
                    distinct--;
                }
                left++;
            }
            ans+=right-left+1;
        }
        System.out.println(ans);
    }
}
