import java.util.*;
public class Solution {


	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
          while(j<=i){
              System.out.print("*");
              j++;
          }
            i++;
            System.out.println();
        }
		
	}

}
