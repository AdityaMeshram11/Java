import java.util.Scanner ;
class HCF 
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first Number - ");
	int n1 = sc.nextInt();
	System.out.println("Enter the Second Number - ");
	int n2 = sc.nextInt();
	int small = (n1<n2) ? n1 : n2 ; // find smallest number 
	
	 while (true) 
	{
	 if (n1 % small  == 0 && n2 % small  == 0 ) 
	 {
		System.out.println("The HCF of "+n1+" and " +n2+ " is :- " +small); 
		break ;
		
	 }
	  small-- ; // decrement 
	}
	
  }
}
  