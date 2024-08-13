// PRINT ALL THE ALTERNATE NUMBER IN A GIVEN NUMBER USING FOR LOOP

import java.util.Scanner;
class AlternateNumber{
  public static void main (String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter A Number :- "); //12345
  int num =sc.nextInt();
  for (int i = num ; i!=0 ; i/=10)  // 1234/10=123 ,12/10=1
   {
	int end = i % 10 ;   // 5 123%10=3 1
	System.out.println(end); //5 3 1
	i=i/10;  //remove 5 remains 1234 , remove 3 remains 12
	
   }
  
  
  }

}