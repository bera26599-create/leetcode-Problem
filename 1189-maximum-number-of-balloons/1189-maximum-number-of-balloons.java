class Solution {
    public int maxNumberOfBalloons(String text) {
        int b=0,a=0,l=0,o=0,n=0;
        for(int i=0;i<text.length();i++){
            char c=text.charAt(i);
            if(c=='b') b++;
            else if(c=='a') a++;
            else if(c=='l') l++;
            else if(c=='o') o++;
            else if(c=='n') n++;
        }
        l=l/2;
        o=o/2;
        return Math.min(Math.min(b, a), Math.min(Math.min(l, o), n));
    }
}