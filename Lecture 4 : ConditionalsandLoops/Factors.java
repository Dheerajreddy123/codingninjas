import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int i=2;
        while(i<=n-1){
            if(n%i==0){
                System.out.print(i);
                System.out.print(" ");
            }
             i=i+1;
            
        }
        
    }
}
