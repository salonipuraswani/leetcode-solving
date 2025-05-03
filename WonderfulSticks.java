//question on code forces: title: WonderfulSticks   url:https://codeforces.com/problemset/problem/2096/A
import java.util.*;
public class Main
{
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	 int numberOfInputs = Integer.parseInt(sc.nextLine());
     for (int i = 0; i < numberOfInputs; i++) {
         int n = Integer.parseInt(sc.nextLine());
         String s = sc.nextLine();
		ArrayList<Integer> result=new ArrayList<>();
		result=solverFunction(n,s);
		for(int j=0;j<result.size();j++) {
			System.out.print(result.get(j)+" ");
		}
		System.out.println();
	}
}
public static ArrayList<Integer> solverFunction(int n,String s){
	ArrayList<Integer> result=new ArrayList<Integer>();
	int maxAvailable=n;
	int minAvailable=1;
	HashSet<Integer> set=new HashSet<>();
	for(int i=n-2;i>=0;i--) {
		if(s.charAt(i)=='>') {
			result.add(maxAvailable);
			set.add(maxAvailable);
			maxAvailable--;
		}
		else {
			result.add(minAvailable);
			set.add(minAvailable);
			minAvailable++;
		}
	}
	for(int i=1;i<=n;i++) {
		if(!set.contains(i)) {
			result.add(i);
			break;
		}
	}
	Collections.reverse(result);
	return result;
}
}
