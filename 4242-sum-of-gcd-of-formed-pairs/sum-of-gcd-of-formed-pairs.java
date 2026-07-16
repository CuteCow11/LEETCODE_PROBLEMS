import java.util.*;
class Solution {
    public long gcdSum(int[] nums) {
        int l=nums.length;
        long[] p=new long[l];
        long[] mx=new long[l];
        long m=0;
        for(int i=0;i<l;i++){
            if(nums[i]>m){
                m=nums[i]; 
            }
            mx[i]=m;
            p[i]=gcd(nums[i],mx[i]);
        }
        Arrays.sort(p);
        int q=l-1;
        long sum=0;
        for(int i=0;i<q;i++,q--){
            sum=sum+gcd(p[i],p[q]);
        }
        return sum;
    }
    public long gcd(long x, long y){
        while (y != 0) {
            long temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}