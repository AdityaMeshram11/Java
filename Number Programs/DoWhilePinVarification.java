import java.util.Scanner ;
class DoWhilePinVarification{
 public static void main (String[]args)
 {
	Scanner sc = new Scanner(System.in);
	int storedpin = 1234 ;
	int attempt = 0 ;
	
	do 
	{
		System.out.println ("Enter Your Pin");
		int pin = sc.nextInt();
		if (pin==storedpin)
		{
			System.out.println ("Login Successful !!");
			break;
		}
		else
		{
			System.out.println ("Pin Incorrect ");
			attempt++;
		}
	}
	while (attempt<4);
	if (attempt>=3)
	{
		System.out.println ("You Reach Max ateempts so try again later !!");
	}
 }
 
}