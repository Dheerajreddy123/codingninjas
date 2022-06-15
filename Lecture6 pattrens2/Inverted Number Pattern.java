import java.util.*;
public class Solution {


	public static void main(String[] args) {
		int n;
        Scanner s=new Scanner(System.in);
		n=s.nextInt();
        int i=1, p=n;
        while(i<=n){
            int j=1;
           
            while(j<=n-i+1){
                
              System.out.print(p);
                j++;
                
                
            }
            
            i++;
            p=p-1;
            System.out.println();
            
        }
		
	}

}
