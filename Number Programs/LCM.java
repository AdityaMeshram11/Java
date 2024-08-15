//LCM PROGRAM 
//LCM stands for Least Comman Multiple , which is a smallest number that is dividible by two number entered by user 

import java.util.Scanner ;
class LCM 
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first Number - ");
	int n1 = sc.nextInt();
	System.out.println("Enter the Second Number - ");
	int n2 = sc.nextInt();
	int large = (n1>n2) ? n1 : n2 ; // find highest number 
	int i = 1 ; 
	//n1 =20 n2= 30  i = 1  large = 30 
	
	 while (true) 
	{
	 if ((large*1)%n1 == 0 && (large*1) % n2 == 0 ) // 1. >>> 30*1 % 20 == 10 false and 30*1 % 30 == 0  
													//2.  >>> 30*2 % 20 == 00 treu  and 30*2 % 30 == 0 true
	 {
		System.out.println("The LCM of "+n1+" and " +n2+ " is :- " +(large*I)); //execute in iteratin 2
		break ;
		
	 }
	  i++ ; //2
	}
	
  }
}
  
  
  // less optimixed solution becouse it will take more number of iteration as compare to above optimized solution
  
 // int i = 1 ;  
//	while (true) 
//	{
//	 if (large%n1 == 0 && large % n2 == 0 )
//	 {
//		System.out.println("The LCM of "+n1+" and " +n2+ " is :- " +lcm);
//		break ;
//		
//	 }
//	 large ++ ;
  
