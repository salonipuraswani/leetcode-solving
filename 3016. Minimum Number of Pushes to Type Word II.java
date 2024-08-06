//brute force
//time complexity:O(nlogn)
//space complexity:O(n)
class Solution {
    public HashMap<Character,Integer> frequencymap(String word){
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        return map;
    }
    public int minimumPushes(String word) {
        HashMap<Character,Integer> map= frequencymap(word);
        if(map.size()<=8){
            return word.length();
        }
        else{
            int diff=map.size()-8;
            int arr[]=new int[map.size()];
            int i=0;
            for(char key: map.keySet()){
                arr[i]=map.get(key);
                i++;
            }
            Arrays.sort(arr);
            int count=0;
            if(diff<=8){
               for(int j=0;j<diff;j++){
                count=count+2*arr[j];
            }
            for(int j=diff;j<arr.length;j++){
                count=count+arr[j];
            }
            }
            else if(diff>8 && diff<=16){
                int rem=diff-8;
                for(int j=0;j<rem;j++){
                count=count+3*arr[j];
            }
            for(int j=rem;j<diff;j++){
                count=count+2*arr[j];
            }
            for(int j=diff;j<arr.length;j++){
                count=count+arr[j];
            }
            }
            else if(diff>16){
                int rem=diff-16;
                for(int j=0;j<rem;j++){
                count=count+4*arr[j];
            }
            for(int j=rem;j<rem+8;j++){
                count=count+3*arr[j];
            }
            for(int j=rem+8;j<diff;j++){
                count=count+2*arr[j];
            }
            for(int j=diff;j<arr.length;j++){
                count=count+arr[j];
            }
            }
            return count;
        }
    }
}

class Solution {
    public HashMap<Character,Integer> frequencymap(String word){
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        return map;
    }
    public int minimumPushes(String word) {
        HashMap<Character,Integer> map= frequencymap(word);
        if(map.size()<=8){
            return word.length();
        }
        else{
            int diff=map.size()-8;
            int arr[]=new int[map.size()];
            int a=0;
            for(char key: map.keySet()){
                arr[a]=map.get(key);
                a++;
            }
            Arrays.sort(arr);
            int reverse[]=new int[arr.length];
            int j=0;
            for(int i=arr.length-1;i>=0;i--){
                reverse[i]=arr[j];
                j++;
            }
            int count=0;
            for(int i=0;i<arr.length;i++){
                count=count+((i/8)+1)*reverse[i];
            }
            return count;
        }
    }
}
