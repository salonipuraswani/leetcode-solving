//time complexity:O(n)
//space complexity:O(1)
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++){
			arr[i] = sc.next();
		}
		System.out.println(minSteps(n,arr));
    }
	public static int minSteps(int n,String arr[]){
		String s=arr[0];
		int count=1;
		for(int i=1;i<n;i++){
			if(arr[i].compareTo(s)!=0){
				s=arr[i];
				count++;
			}
		}
		return count;
	}
}
