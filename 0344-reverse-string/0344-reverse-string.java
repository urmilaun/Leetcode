class Solution {
    public void reverseString(char[] s) {

        char temp;
       for(int i=0, j=s.length-1; i<s.length/2; i++,j--){
           temp=s[i];
           s[i]=s[j];
           s[j]=temp;
       }
        
    }
}