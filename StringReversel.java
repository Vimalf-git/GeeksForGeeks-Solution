
/*
Question:  Given a string, say S, print it in reverse manner eliminating the repeated characters and spaces.

Input:  Input: S = "GEEKS FOR GEEKS"
Output: "SKEGROF"

Input: S = "I AM AWESOME"
Output: "EMOSWAI"

*/

class Solution
{
    public String reverseString(String s)
    {
        s=s.replace(" ","");
         StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            
            if(sb.indexOf(String.valueOf(s.charAt(i)))!=-1){
            }else{
            sb.append(s.charAt(i));
            }
        }
        String result=String.valueOf(sb);
        return result;
    }
}
