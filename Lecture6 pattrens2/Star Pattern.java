/*Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
   *
  *** 
 *****
Sample Input 2 :
4
Sample Output 2 :
    *
   *** 
  *****
 *******   */
import java.util.*;
public class Solution {
   

	public static void main(String[] args) {
		 int n;
    Scanner s= new Scanner(System.in);
    n=s.nextInt();
    int i=1;
    while(i<=n){
        int j=1;
        while(j<=n-i){
        System.out.print(' ');
            j++;
        
     }
        int num=1;
        
        while(num<=i){
         System.out.print("*");
            num++;
            
        
     }
        int dec=i-1;
        while(dec>=1){
           System.out.print("*");
            dec--; 
            
        }
        
        System.out.println();
        i++;
        
     }
		
	}

}
