//PRINT ALL THE SUM of NUMBER IN A GIVEN NUMBER USING FOR LOOP

import java.util.Scanner;
class SumOfDigitInNumbers{
  public static void main (String[]args){
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter A Number :- "); //123456
  int num =sc.nextInt();
  
  int digitsum = 0 ;
  
   for (int i = num ; i!=0 ; i/=10 )  
   {
	int end = i % 10 ;   
	digitsum +=end ; 
	}
	
  System.out.println(digitsum);
   
  }

}