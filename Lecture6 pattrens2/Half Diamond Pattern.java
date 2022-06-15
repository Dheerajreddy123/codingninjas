import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        System.out.println("*");
        int i=1;
        int n1=n+1/2;
        int n2=n1-1;
        
        while(i<=n1){
            System.out.print("*");
            int j=1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            int dec=i-1;
            while(dec>=1){
                System.out.print(dec);
                dec--;
            }
             System.out.print("*");
             System.out.println();
             i++;
            
        }
        int k=n2;
       while(k>=1){
           System.out.print("*");
           int j=1;
           while(j<=k){
               System.out.print(j);
               j++;
           }
           int p=j-2;
           int m=1;
           while(m<=k-1){
               System.out.print(p);
               m++;
               p--;
           }
           System.out.print("*");
           System.out.println();
           k--;
           
       }
            
         
        
    System.out.println("*");   
    }
}
