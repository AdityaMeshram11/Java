//PRINT ALL THE EVEN AND ODD NUMBER IN A GIVEN NUMBER USING FOR LOOP

import java.util.Scanner;
class OddEvenNumbers2{
  public static void main (String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter A Number :- "); //123456
  int num =sc.nextInt();
	System.out.print("The Even Numbers :- ");
   for (int i = num ;i!=0 ; i/=10 )
   {
	int end = i % 10 ;   //extract last digit 
	if (end % 2 ==0)
	{
	  //System.out.print("The Even Numbers :- ");
	  System.out.print(end +" "); //print Even Number
	  
	}

	
   }
   System.out.println();
   
   System.out.print("The Odd Numbers :- ");
   
   for (; num!=0  ; num/=10 ) 
   {
	int end1 = num % 10 ;   //extract last digit 
	if (end1 % 2 !=0)
	{
	  //System.out.print("The Odd Numbers :- ");
	  System.out.print(end1 +" "); //print Even Number
	  
	}
	

   }
   
  }

}