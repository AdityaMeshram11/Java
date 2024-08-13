import java.util.Scanner;
class CountDigit{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
	System.out.println("Enter your Number ");
	int num =sc.nextInt();
	int count = 0 ;
	for (int i = num ; i>0 ; i=i/10 )
	{
		int last = i % 10 ;
		System.out.println(last);
		count++;
		
	}
	System.out.println("Count of Digit Is "+count);
	
  }
}