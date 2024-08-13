import java.util.Scanner ;
class Extract{
  public static void main (String []args)
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a Number ");
	 int num = sc.nextInt();
	 //while(num>0)
	 {
		int last = num % 10;
		System.out.println(last);
		num/=10;
		
	  }
	 
	 for (; num>0 ; num/=10 )
	   {
		int last = num % 10;
		System.out.println(last);
	
	   } 
	 
	 
	 do
	 {
		int last = num % 10;
		System.out.println(last);
		num/=10;
	 }
	 while(num>0);
	 
	}
}