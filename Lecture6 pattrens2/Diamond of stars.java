import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
    int n;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
        int i=1;
        int n1=(n+1)/2;
        //int n2=n1-1;
        int n2=n/2;
        while(i<=n1){
           int spaces1=1;
            while(spaces1<=n1-i){
                System.out.print(' ');
                spaces1=spaces1+1;
            }
            int stars1=1;
            while(stars1<=2*i-1){
                System.out.print("*");
                stars1=stars1+1;
            }
             
          
            System.out.println();
            i++;
               
            
        }      
        
                 
                // int j=1;
                i=n2;// i starts from secondHalf
            while(i>=1){
                int space2=1;
                while(space2<=n2-i+1){
                    System.out.print(' ');
                    space2++;
                }
                int stars2=1;
                 while(stars2<=2*i-1){
                    System.out.print("*");
                    stars2++;
                }
              
                System.out.println();
                i--;
            }
        
    }
}
