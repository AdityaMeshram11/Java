//PRINT ALL THE ALTERNATE NUMBER IN A GIVEN NUMBER USING WHILE LOOP

import java.util.Scanner;
class AlternateNumber1{
  public static void main (String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter A Number :- "); //123456
  int num =sc.nextInt();
  int i = num ;
   while ( i!=0  )  
   {
	int end = i % 10 ;   //extract last digit 
	System.out.println(end); //print last digit
	i/=10 ;  //remove last digit 
	i/=10 ;  //remove last digit again to get alternate
   }
  
  }

}