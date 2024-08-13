//PRINT ALL THE SUM of NUMBER IN A GIVEN NUMBER USING FOR LOOP

import java.util.Scanner;
class PerfectNumbers{
  public static void main (String[]args){
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter A Number :- "); //123456
  int num =sc.nextInt();
  
  int digitsum = 0 ;
  int digitprod = 1 ;
  
  
   for (int i = num ; i!=0 ; i/=10 )  
   {
	int end = i % 10 ;   
	digitsum +=end;
	digitprod *=end ; 
	}
	
   System.out.println("Sum of all The Digits :- "+digitsum);
   System.out.println("product of all The Digits :- "+digitprod);
   if (digitsum==digitprod)
   {
	System.out.println("It is A Perfect Number ");
   }
   else
   {System.out.println("It is Not Perfect Number ");}
  }

}