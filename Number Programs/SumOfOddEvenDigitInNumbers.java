import java.util.Scanner;
class SumOfOddEvenDigitInNumbers{
  public static void main (String[]args){
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter A Number :- "); //123456
  int num =sc.nextInt();
  
  int evensum = 0;  // variable for even digit sum
  int oddsum = 0 ;  // variable for odd digit sum
  
  int digitsum = 0 ;  // variable for  digit sum
  
   for (int i = num ; i!=0 ; i/=10 )  // Ini , condn , update
   {
	int end = i % 10 ;   //extract last
	
	if (end % 2 == 0)  	//check even or not
	{
	 evensum+=end ;		// if even then add to evensum variable
	}
	else
	{
	  oddsum+=end ;  //// if even then add to ODDsum variable
	}
	digitsum +=end ; 
	
	}
	
  System.out.println("Sum of all The Digits :- "+digitsum);
  System.out.println("Sum of all The Even Digits :- "+evensum);
  System.out.println("Sum of all The Odd Digits :- "+oddsum);
  System.out.println();
  if (evensum == oddsum)
  {
	  System.out.println(" addition of even digit and addition of odd digit is Same");
  }
  else
  {
	  System.out.println(" addition of even digit and addition of odd digit is Different ");
  }


  }

}