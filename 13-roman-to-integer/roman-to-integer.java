class Solution {
    public int romanToInt(String s) {
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symb={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int res=0;
        if(s.length()>0 && s.length()<16){
            int i=0;
            while(!(s.isEmpty())&& i<symb.length){
                if(s.startsWith(symb[i])){
                    res=res+values[i];
                    s=s.substring(symb[i].length());
                }
                else{
                    i++;
                }
            }
            }
            return res;
}
}