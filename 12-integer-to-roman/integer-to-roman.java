import java.util.*;
class Solution {
    public String intToRoman(int num) {
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symb={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String res="";
    if( num>0 && num <4000)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<values.length;i++){
            if(num==0)
            break;
            while(num>=values[i]){
                sb.append(symb[i]);
                num=num-values[i];
            }
        }
         res=sb.toString();
    }
    return res;
    }
    
}