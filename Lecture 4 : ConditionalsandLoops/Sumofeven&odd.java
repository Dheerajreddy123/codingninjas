import java.util.*;
public class Main {
	
	public static void main(String[] args) {
        
		// Write your code here
        Scanner s =new Scanner(System.in);
        
        int sum1=0,sum2=0;
        int n;
        n=s.nextInt();
        while(n>0){
            int p=n%10;
            if(p%2==0){
                sum1=sum1+p;
            }
            
            else{
               sum2=sum2+p; 
            }
            n=n/10;
        }
        System.out.print(sum1);
         System.out.print(" ");
        System.out.print(sum2);
        

	}
}
