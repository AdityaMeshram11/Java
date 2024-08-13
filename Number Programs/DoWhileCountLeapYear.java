import java.util.Scanner;
class DoWhileCountLeapYear{
 public static void main (String[]args)
 {
	 
 Scanner sc = new Scanner (System.in);
 
 System.out.println("Enter The Start Year :- "); 
 int startyear = sc.nextInt();
 
 System.out.println("Enter The End Year :- ");
 int endyear = sc.nextInt();
 System.out.println("The Starting Years is :- "+startyear);
 System.out.println("The End Years is :- "+endyear);
 
 System.out.println("Leap Years :");
 System.out.println("________");
 
 int leapYearCount = 0; 
 
  do
  {
	  if ((startyear % 4 == 0 && startyear % 100 != 0) || (startyear % 400 == 0 ))
	  {
		  System.out.println(startyear);
		  leapYearCount++;
	  } 
	  
	  startyear++ ;
	  
  }
  while (startyear <= endyear );
  System.out.println("________");
   System.out.println("The Number of Leap Years in given range is :- "+leapYearCount);
  }

}