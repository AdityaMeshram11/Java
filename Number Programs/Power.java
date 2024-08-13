import java .util.Scanner;
class Power{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number :- "); // get no from user
	int num =sc.nextInt();
	System.out.println("Enter the Power :- ");
	int power = sc.nextInt();   // get no from user
	int result = 1 ;  //variable to store result 
	int i = 1 ;
	//for (int i = 0 ; i < power ; i++)  //initialize and declare i as 0 , and provide condition till i less than power
//	{									// and increment i ++ for update		//i<power= 
//	  result = result * num ;  // result stores the result by multipling with num in given power iteration 
//	}
//	System.out.println(result); // print result 
//	while (i<=power)
//	{
//		result = result * num ;
//		i++;
//	}
//	System.out.println(result);
	do
	{
		result =result*num ;
		i++;
	}
	while(i<=power);
	System.out.println(result);
	

  }
}