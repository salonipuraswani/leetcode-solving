import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int a=sc.nextInt();
            sc.nextLine();
            boolean result=solution(x,y,a);
            if(result){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
      
    }
    public static boolean solution(int x,int y,int a){
        boolean result=true;
        int sum=0;
        int p=x+y;
        int limit=a+1;
        int r=limit%p;
        if(r!=0){
         if(r<=x){
            result=false;
        }
        }
        return result;
    }
}