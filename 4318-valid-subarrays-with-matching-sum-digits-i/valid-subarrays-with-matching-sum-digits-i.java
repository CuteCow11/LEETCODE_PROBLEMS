import java.util.*;

class Solution {
    public int countValidSubarrays(int[] nums, int x) {

        int c = 0;
        long sum;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (isvalid(sum, x)) {
                    c++;
                }
            }
        }
        return c;
    }

    public boolean isvalid(long s, int x) {
        if (s % 10 != x) {
            return false;
        }
        long fd = s;
        while (fd >= 10) {
            fd /= 10;
        }
        return fd == x;
    }
}