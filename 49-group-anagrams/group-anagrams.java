import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> st = new ArrayList<>();
        if (strs.length > 0 && strs.length <= 10000) {

            int i = 0;
            while (i < strs.length) {
                if(strs[i]==null){
                    i++;
                    continue;
                }
                List<String> cp=new ArrayList<>();
                cp.add(strs[i]);
                for (int j = i + 1;j < strs.length ; j++) {
                    if (strs[j]!=null && compare(strs[i], strs[j])) {
                        cp.add(strs[j]);
                        strs[j]=null;
                    }
                }
                i++;
                st.add(cp);
            }
        }
        return st;
    }

    public boolean compare(String s1, String s2) {
        int f = 0;
        if (s1.length() != s2.length()) {
            return false;
        } else {
            char[] c1= s1.toCharArray();
            char[] c2=s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            return Arrays.equals(c1,c2);
        }
    }
}