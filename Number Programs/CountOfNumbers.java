//PRINT ALL THE COUNT OF  NUMBER IN A GIVEN NUMBER USING FOR LOOP

import java.util.Scanner;
class CountOfNumbers{
  public static void main (String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter A Number :- "); //123456
  int num =sc.nextInt();
  int count = 0 ;
  //int evensum = 0 ;
  //int Oddsum = 0 ;
   for (int i = num ;i!=0 ; i/=10 )  //1234
   {
	int end = i % 10 ;   //extract last digit  4
	i/=10;
	count++;
	
	}
	
  System.out.println(count);
   
   
   
   
   
  }

}