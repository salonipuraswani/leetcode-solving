// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        String s1="ABCA";
        String s2="TFFT";
        System.out.println(ans(s1,s2));
    }
    public static String ans(String s1,String s2){
        int l1=s1.length();
        int l2=s2.length();
        int size=l1+l2-1;
        int flag=0;
        char arr[]=new char[size];
        Arrays.fill(arr,'0');
        for(int i=l2-1;i>=0;i--){
            if(s2.charAt(i)=='T'){
                flag=1;
                for(int j=0;j<l1;j++){
                    if(arr[i+j]=='0'){
                        arr[i+j]=s1.charAt(j);
                    }
                    else if(arr[i+j]==s1.charAt(j)){
                        
                    }
                    else{
                        return "-1";
                    }
                }
            }
        }
        if(flag==0){
            return "-1";
        }
        String s="";
        for(int i=0;i<size;i++){
            if(arr[i]=='0'){
                s=s+'A';
            }
            else{
                s=s+arr[i];
            }
        }
        return s;
    }
}
