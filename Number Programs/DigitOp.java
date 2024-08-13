import java.util.Scanner;
class DigitOp{
  public static void main (String [] args){
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter A Number :- " );  //takes the input  //1234
  int num =sc.nextInt();   //1234
  
  int last = num % 10 ; //stores last digit  1234%10 =4
  num =num /10 ;
  //int ipnum = num ; //tempvar
  int midprod = 1 ; //for getting the product of middle numbers
  int first = 0 ; // for first digit
  
  for ( ; num>0 ; num/=10) // num initialized ; num gret then o then true ; update to remove the last digit
  {
	  if(num /10 == 0 )  // if after division num last questiont remains 0 then that number is first number
	  {
		  first = num ;  //if above condn is satisfied then store that num in first
	  }
	  else
	  {
		 int pnum = num % 10 ; //create a new variable for extracting last digit for product 
		 midprod *= pnum ; // digit goes into for multiplication 
		 
	  }
  } 
  
  System.out.println("First Digit :- " + first);
  System.out.println("last Digit :- " + last);
  System.out.println("sum of first and last :- " +(first+last));
  System.out.println("product of middle number :- " +midprod);
   
  }


}