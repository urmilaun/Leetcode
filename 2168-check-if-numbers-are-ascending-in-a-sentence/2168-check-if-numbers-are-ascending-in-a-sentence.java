class Solution {
    public boolean areNumbersAscending(String s) {

        String a[]=s.split(" ");
        int m = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            try{
                int k=Integer.parseInt(a[i]);
                if(m<k){
                    m=k;
                }
                else{
                    return false;
                }
            }
            catch(Exception c){
                continue;
            }
        }
        return true;
    }
}