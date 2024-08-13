import java.util.Scanner;
class CountDigit2{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
	System.out.println("Enter your Number ");
	int num =sc.nextInt();	//initialization
	int count = 0 ;			//variable for counting digit
	int i = num ;	//creating temp variable
	do   //creating loop to execute
	{
		int last = i % 10 ;  // extract last digit using modulas of 10 
		//System.out.print(last+" "); //print last digit
		i = i/10 ;  // remove last digit by dividing it by 10
		
		count++ ;  //increment the count variable to get count
	}
	while ( i >0 ) ; // providing condition
	
	//System.out.println("");
	System.out.println("Count of Digit of Given Number "+num+" is "+count);
	//print 
  }
}