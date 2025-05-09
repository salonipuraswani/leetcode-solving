import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int waiting=0;
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    String event_type=sc.next();
		    int number=sc.nextInt();
		    if(event_type.compareTo("P")==0){
		        waiting=waiting+number;
		    }
		    else{
		        if(number>waiting){
		            System.out.println("YES");
		            waiting=0;
		        }
		        else if(number==waiting){
		            System.out.println("NO");
		            waiting=0;
		        }
		        else{
		            System.out.println("NO");
		            waiting=waiting-number;
		        }
		    }
		    sc.nextLine();
		}
	}
}