class Solution {
    public int maxProduct(int n) {
        int max=0;
        int p;
        String k=String.valueOf(n);
        for(int i=0;i<k.length();i++){
            for(int j=i+1;j<k.length();j++){
                p=Integer.parseInt(String.valueOf(k.charAt(i)))*Integer.parseInt(String.valueOf(k.charAt(j)));
                if(p>max){
                    max=p;
                }
            }
        }
        return max;
    }
}