import java.util.*;
public class Main {
	
	public static void main(String[] args) {
	    int basic;
        int allow;
         
        String grade;
        Scanner s=new Scanner(System.in);
        basic=s.nextInt();
        grade=s.next();
        char c=grade.charAt(0);
        if(c=='A'){
            allow=1700;
        }
         else if(c=='B'){
            allow=1500;
        }
         else{
             allow=1300;
         }
        double hra=(basic*20.0)/100;     //2/100*basic;
        double da=(basic*50.0)/100;  	//5/100*basic;
       double pf=(basic*11.0)/100;		//11/100*basic;
   double total_salary = basic + hra + da + allow-pf;
				total_salary=Math.round(total_salary); // for round off the variable 
            int ts=(int)(total_salary);
          System.out.println(ts);

        
	}
}
