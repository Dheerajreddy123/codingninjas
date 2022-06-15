import java.util.*;
public class Main {
	
	public static void main(String[] args) {
    int n;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
        int i=1;
        if(n==0){
            
        }
        else{
        System.out.println("1=1");
        }

    while(i<=n-1){
        int j=1;
     while(j<=i+1){
         if(j==i+1){
             System.out.print(j);
         }
         else{
              System.out.print(j);
               System.out.print("+");
               
         }
         j++;
     } 
        j=1;
        int sum=0;
      while(j<=i+1){
          sum=sum+j;
          j++;
          
      }
        System.out.print("=");
        System.out.print(sum);
        System.out.println();
        i++;
        
    }
    
        
	}
}
