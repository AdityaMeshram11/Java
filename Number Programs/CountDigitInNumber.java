import java.util.Scanner;
class CountDigitInNumber{
  public static void main (String[]args){
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter A Number :- "); //12743542
  int num =sc.nextInt();
  System.out.println("Enter A Number you want to Search :- "); //12743542
  int search =sc.nextInt();

  int countdigit =0 ;
  
   for ( int i = num ; i> 0 ; i/=10 )  //1
   {
	int digit = i % 10 ;   //
	if (digit == search )
	{
		countdigit++;
		
	}
	
	
   }
   
   System.out.println("The count " +search+ " in given Number "+num+" is "+countdigit);
   
   
  }

}