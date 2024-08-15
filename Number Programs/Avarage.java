import java.util.Scanner ;
class Avarage 
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the count of number - ");  //get count from user that how many number he want to enter 
	int count = sc.nextInt(); //store in count
	
	int number = 0 ; // create number variable to make sum of numbers entered by user
	int sum = 0 ;  // create sum variable to do addition on variable 
	float avg = 0 ;  // create avg variable to get avg 
	
	 
	 for (int i =1 ; i <= count ; i++ ) // start the loop  <<create var i with 0 value in it , provide condition till i <= count , update i >>.
	 {
	  System.out.println("Enter The "+i+ " number"); //printing statement 
	   number= sc.nextInt();
	   sum += number ;  // here sum is done 
	 }
	 avg = sum / count ;  // here we find avg by sum divide by count (no. of variable)
     System.out.println("The avg Of given Numbers is :- " +avg);  //printing statement

	
	
	
  }


}	