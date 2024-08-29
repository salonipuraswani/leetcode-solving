//problem statement:Here is a weird problem in Susan’s terminal. He can not write more than two words each line, if she writes more than two, it takes only 2 words and the rest are not taken. So she needs to use enter and put the rest in a new line. For a given paragraph, how many lines are needed to be written in Susan’s terminal
//Sample Input:
// How long do you have to sit dear ?

// Sample Output:
// 4

// Explanation:
// The writing will be:
// How long
// Do you
// Have to
// Sit dear ?

public class Main
{
	public static void main(String[] args) {
		String s="How long do you have to sit dear ?";
		System.out.println(numberOfLines(s));
	}
	public static int numberOfLines(String s){
	    int words=countWords(s);
	    int ans=words/2;
	    if(ans%2!=0){
	        ans=ans+1;
	    }
	    return ans;
	}
	public static int countWords(String s){
	    s=s.toLowerCase();
	    s=s.trim();
	    while(s.contains("  ")){
	        s=s.replaceAll("  "," ");
	    }
	    String arr[]=s.split(" ");
	    int count=0;
	    for(int i=0;i<arr.length;i++){
	        String split=arr[i];
	        if(split.contains("a")||split.contains("b")||split.contains("c")||split.contains("d")||split.contains("e")||split.contains("f")||split.contains("g")||split.contains("h")||split.contains("i")||split.contains("j")||split.contains("k")||split.contains("l")||split.contains("m")||split.contains("n")||split.contains("o")||split.contains("p")||split.contains("q")||split.contains("r")||split.contains("s")||split.contains("t")||split.contains("u")||split.contains("v")||split.contains("w")||split.contains("x")||split.contains("y")||split.contains("z")){
	            count++;
	        }
	    }
	    return count;
	}
}
