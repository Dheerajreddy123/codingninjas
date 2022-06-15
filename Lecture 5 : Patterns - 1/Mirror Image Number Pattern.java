import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		int n,i=1;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        while(i<=n){
            int S=1;
            while(S<=n-i){
              System.out.print(' ');
                S++;
            }
            int st=1;
            while(st<=i){
                 System.out.print(st);
                st++;
            }
            
           System.out.println();
            i++;
        }

		
	}

}
