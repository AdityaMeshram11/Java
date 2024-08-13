import java.util.Scanner;
class Palindrom{
  public static void main (String [] args){
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter A Number :- " );
  int num =sc.nextInt(); 
  int temp = num ;
  int rev = 0 ;
  while (num>0)
  {
	int last = num % 10 ;
	rev = rev * 10 + last ;
	num /=10 ;
  }
  //System.out.println(rev);
  if (temp == rev)
  {
	System.out.println("The given Number is A Palindrom");
  }
  else
  {
	System.out.println("The given Number is Not A Palindrom");
  }
  
  
}
}