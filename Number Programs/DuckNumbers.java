
import java.util.Scanner;
class DuckNumbers{
  public static void main (String[]args){
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter A Number :- "); //1207
  int num =sc.nextInt();
  boolean storedigit= false  ;
  int count = 0;
  //int digit =0 ;
  
   for ( int i = num ; i> 0 ; num/=10)  //1207 true 120
   {
	int digit = num % 10 ;   //7 0
	if (digit == 0)
	{
	  storedigit = true ;
	  count++;
	  break ;
	}
	else if (num == 0)
	{
		count++;
		break;
	}
		
	
   }
   
   
   if (storedigit)
	{
	 System.out.println("the Given Number is Duck Number");
	 System.out.println("The count in given Number is "+ count);
	}
	else 
	{
		System.out.println("the Given Number is  not a Duck Number");
	}
	
	
	// MORE OPTIMIZED SOLUTION FOR ABOVE PROBLEM :-
  
  //   int num = 12345 ; // consider input from user is 12345
  //   
  //  while (num != 0) // loop with condition 
 //    {
//	    int rem = num % 10 ; // loop continue give last digit 
//       if (rem == o )  //it checks rem extracted dogit is o or not 
//		{ 
//           break ;	//if rem digit is 0 then break the loop
//		}
//  	num /=10 ; // if last digit is not  0 then continueto remove the remaining digits from last 
  //   }
//    if (num==0)  if the num variale value become 0 then it is a not contains any xero in it 
//		{
//			S.o.pln ("It is not a duck number"); // so given no is not duck number
//      }
//		else // if 0 present  then it is a duck number
//      {
//			S.o.pln ("It is a duck number");	
//		}
//	
	
   
  }

}