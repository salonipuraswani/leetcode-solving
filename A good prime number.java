//Problem Statement  :

// A prime number is a number which is divisible by one and itself. Also a number is called a good  prime number if the sum of its digits is a prime number. For example a number 23 is a good prime number because the sum of 2 and 3 ( 2+3=5) is 5 which is a prime number. You are given an integer K. Your task is to find the kth good prime number that is greater than a provided number N.
// Sample Input 1:

// 4  4

// Sample Output 1:

// 12
import java.util.*;
class Main {
	public static int sod(int number){
		int sum=0;
		while(number>=1){
			int k=number%10;
			sum=sum+k;
			number=number/10;
		}
		return sum;
	}
	public static boolean isPrime(int n){
		boolean ans=false;
		boolean flag=false;
		if(n>1){
			for(int i=2;i<=n/2;i++){
				if(n%i==0){
					flag=true;
					break;
				}
			}
			if(flag==false){
				ans=true;
			}
		}
		return ans;
	}
    public static int solve(int n, int k) {
       int number=n+1;
		int count=0;
		while(count!=k){
			int sod=sod(number);
			if(isPrime(sod)){
				count++;
			}
			if(count!=k){
				number++;
			}
		}
		return number;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solve(n, k));
    }
}
