//PRINT ALL THE EVEN AND ODD NUMBER IN A GIVEN NUMBER USING  WHILE LOOP

import java.util.Scanner;
class OddEvenNumbers1{
  public static void main (String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter A Number :- "); //123456
  int num =sc.nextInt();
  int i = num ;
   while ( i!=0  )
   {
	int end = i % 10 ;   //extract last digit 
	if (i % 2 ==0)
	{
	  System.out.print("The Even Numbers :- ");
	  System.out.println(end +" "); //print Even Number
	  
	}
	
	i /=10 ;
   }
   
    while ( num!=0  ) 
   {
	int end1 = num % 10 ;   //extract last digit 
	if (num % 2 !=0)
	{
	  System.out.print("The Odd Numbers :- ");
	  System.out.println(end1 +" "); //print Even Number
	  
	}
	
	num /=10 ;
   }
   
  
  }

}