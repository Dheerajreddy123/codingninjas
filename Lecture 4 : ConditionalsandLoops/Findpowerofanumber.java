import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        int n,x;
        Scanner s=new Scanner(System.in);
        x=s.nextInt();
        n=s.nextInt();
   
        if((n>=0&&n<=9)&&(x>=0&&x<=9)){
         
          double m =  Math.pow(x,n);
	            int intPart = (int) m;  
               

          System.out.println(intPart);
        
        }
       
    }
}
