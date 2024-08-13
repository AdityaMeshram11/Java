import java.util.Scanner;
class DigitOp1{
  public static void main (String [] args){
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter A Number :- " );  //takes the input  //1234
  int num =sc.nextInt(); 
  int temp = num;  //1234
  
  int countDigit = 0; //4
  int count = 0;   // 1  2 3 4

  int midprod = 1 ; 
  int sum = 0 ; 
  
  for(;num > 0; num /= 10)
  {
     countDigit++;  //
  }
  
  num = temp;
  
  for ( ; num>0 ; num/=10) 
  {
      int pnum = num % 10 ; //  4  3  2  1
	  count++;
	  
	  if(count == 1 || count == countDigit ) 
	  {
		  sum += pnum ;  //0+4 =4 +1 =5
	  }
	  else
	  { 
		 midprod *= pnum ; //1*3 =3 *2 =6
		 
	  }
  } 
  System.out.println("sum of first and last :- " +sum);
  System.out.println("product of middle number :- " +midprod);
  
  // MORE OPTIMIZED SOLUTION FOR ABOVE PROBLEM :-
  
  // ##int num = 12345 ; 
  //   int prod = 1 ;  // variable for middle product 
  //	int sum = num % 10 ;  //sum varaible take last digit in it 
  // 	num /=10 ;  // here last digit is removed 
  //  while (num > 9)  // loop started with condition num > 9 means it will give last remaining digit in num and 
 //    {
	//	int rem = num % 10 ; // loop continue give last digit 
	//  prod = prod * rem ; // that last digit will be goingto multiply with prod variable which stores 1 valie 
//      num/=10;	// here remove last digit by dividing by 10
//		}
//	 sum = sum + num ; // in sum we already store last digit and when loop condn become false last 
//  					  remaining value in num will be the first value ande added with last digit value
// s . o .  pln (sum);
//    s . o .  pln (prod);  //print 
  
  
  
   
  }


}