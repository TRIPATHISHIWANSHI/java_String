//Given two binary strings a and b, return their sum as a binary string.
class Solution {
    public String addBinary(String a, String b) {
        StringBuffer s1=new StringBuffer(a);
        StringBuffer s2=new StringBuffer(b);
        StringBuffer res=new StringBuffer();
        s1.reverse();s2.reverse();
        int carry=0;
        int i=0,sum;
        while(i<s1.length()||i<s2.length())
        {
            sum= carry;
            if(i<a.length()) sum+= s1.charAt(i)-'0';
            if(i<b.length()) sum+= s2.charAt(i)-'0';
            if(sum==0) 
            {
                 carry=0;
                 res.append('0');
            }
            if(sum==1) 
            {
                 carry=0;
                 res.append('1');
             }
            if(sum==2)
            {
                carry=1;
                res.append('0');
            }
           if(sum==3) 
            {
                carry=1;
                res.append('1');
            }
            i++;
        }
    
        if(carry==1)   res.append('1');
        res.reverse();
        return res.toString();    
    }
}
