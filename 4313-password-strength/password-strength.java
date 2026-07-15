import java.util.*;
class Solution {
    public int passwordStrength(String password) {
        int j;
        int strg = 0;
        for (int i = 0; i < password.length();) {
            int c = (int) (password.charAt(i));
            if (c >= 48 && c <= 57) {
                strg = strg + 3;
                password = password.replace(String.valueOf(password.charAt(i)), "");
            } else if (c >= 65 && c <= 90) {
                strg = strg + 2;
                password = password.replace(String.valueOf(password.charAt(i)), "");
            } else if (c >= 97 && c <= 122) {
                strg = strg + 1;
                password = password.replace(String.valueOf(password.charAt(i)), "");

            } else if (c == 33 || c == 64 || c == 35 || c == 36) {
                strg = strg + 5;
                password = password.replace(String.valueOf(password.charAt(i)), "");
            } else {
                i++;
                continue;
            }
        }
       return strg;
    }
     
}