import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();
        String s = "123456789";
        
        int minL = String.valueOf(low).length();
        int maxL = String.valueOf(high).length();
        
        for (int l = minL; l <= maxL; l++) {
            for (int i = 0; (i+l) <= 9; i++) {
                int n = Integer.parseInt(s.substring(i, i + l));
                if (n >= low && n <= high) {
                    res.add(n);
                }
            }
        }
        
        return res;
    }
}