////A number whose sum of factors (excluding the number itself) is equal to the number is called a perfect number.
// 6 factor is 1 , 2 ,3 ,(6 not considerd ) and  sum of factors 1+2+3 = 6 
//here the num 6 is got after we add there factor so the 6 is perfect number


import java.util.Scanner ;
class PerfectNumber1 
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number :- ");
	int num = sc.nextInt();  //num = 6
	
	int sum = 0 ; // sum variable for storing sum og digits , sum = 0 
	
	for (int i =1 ; i <= num/2 ; i++) // start for loop till i not equal to num / 2 . and i increment
	{
	  if(num % i ==0 ) 
	  {
		sum +=i ;
	  }
	}
	
	
	// if 6 == 6 then itis neon number else not .
	if (num == sum ) 
	{
		System.out.println(num+" is a Perfect Number .");
	}
	else
	{
		System.out.println(num+" is not a Perfect Number .");
	}
	
	
	}
	
  }
  
  
//  Read or initialize a number (n).
//Declare a variable (s) for storing sum.
//Find the factors of the given number (n) by using a loop (for/ while).
//Calculate the sum of factors and store it in a variable s.
//Compare the sum (s) with the number (n):
//If both (s and n) are equal, then the given number is a perfect number.
//Else, the number is not a perfect number.