/*Print the following pattern for the given number of rows.
Pattern for N = 4






Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
           1
         232
       34543
     4567654
   567898765
Sample Input 2:
4
Sample Output 2:
           1
         232
       34543
     4567654 */
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int i=1,p;
        while(i<=n){
            int spaces=1;
            while(spaces<=n-i){
                System.out.print(" ");
                spaces++;
            }
            p=i;
            int j=1;
             while(j<=i){
                System.out.print(p);
                 p=p+1;
                j++;
            }
//             int dec=p-1;
//             while(dec>=i){
//                 System.out.print(dec);
//                 dec--;
                
                
//             }
             j=1;
         p=2*i-2;
         while(j<=i-1)
         { 
             System.out.print(p);
                 p=p-1;
             j++;
         }
            System.out.println();
            i++;
            
        }
        
	}
}

