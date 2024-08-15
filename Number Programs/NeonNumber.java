//A positive integer whose sum of digits of its square is equal to the number itself is called a neon number.
// 9 sq is 81 ,and  8+1 = 9 , so 9 Neao Number
import java.util.Scanner ;
class NeonNumber 
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number :- ");
	int num = sc.nextInt();  //num = 9
	int sq = num*num ;  //make square of that number , 9*9 = 81 
	int tempsq = sq ; 
	int sum = 0 ; // sum variable for storing sum og digits , sum = 0 
	
	while (sq!=0) // stsrt while loop till square not equal to 0 .
	{
	  int digit = sq % 10 ;  //extract digit of square  81 % 10 = 1 , 8 %10 = 8 
	  sum = sum + digit ; // sum = 1 > 
	  sq/=10 ; //remove 1 > remove 8 
	}
	System.out.println("square is :- "+tempsq);
	System.out.println("sum of square digit is  :- "+sum);
	
	// if 9 == 9 then itis neon number else not .
	if (num == sum ) 
	{
		System.out.println(num+" is a Neon Number .");
	}
	else
	{
		System.out.println(num+" is not a Neon Number .");
	}
	
	
	}
	
  }