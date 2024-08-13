import java.util.Scanner;
class Factorial
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number :- ");
	int num = sc.nextInt();  // take no from user
	int fact = 1 ; // create var for to store variable
	while (num!=0) //condm till num  become 0 
	{
	  fact = fact * num ; //fact multiply with num and store in fact for next iteration to multiply
	  num-- ; // Decrement the num so it become 4 3 2 1 till become 0 
	}
	System.out.println(fact);  //print fact
  }
}