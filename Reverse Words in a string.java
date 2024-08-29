//time complexity:O(n)
//space complexity:O(1)
class Solution {
    public String reverseWords(String s) {
        ArrayList<String> list=new ArrayList<String>();
        String ans="";
        s=s.trim();
        while(s.contains("  ")){
          s=s.replaceAll("  "," ");
        }
        
        String arr[]=s.split(" ");
        for(int i=arr.length-1;i>0;i--){
            ans=ans+arr[i]+" ";

        }
        ans=ans+arr[0];
        return ans;
    }
}
