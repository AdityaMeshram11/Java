import java.util.Scanner;
class DoWhileLeapYear{
 public static void main (String[]args)
 {
	 
 Scanner sc = new Scanner (System.in);
 
 System.out.println("Enter The Start Year :- "); 
 int startyear = sc.nextInt();
 
 System.out.println("Enter The End Year :- ");
 int endyear = sc.nextInt();
 System.out.println("Leap Year ");
 System.out.println("________");
 
  do
  {
	  if ((startyear % 4 == 0 && startyear % 100 != 0) || (startyear % 400 == 0 ))
	  {
		  System.out.println(startyear);
	  } 
	  
	  startyear++ ;
  
  }
  while (startyear <= endyear );
  System.out.println("________");
   
  }

}