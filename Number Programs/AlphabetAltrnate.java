import java.util.Scanner;
class AlphabetAltrnate{
 public static void main (String[]args)
 {
	 
 Scanner sc = new Scanner (System.in);

System.out.print("Enter The First Character of Alphabet :- "); 
char ch = sc.next().charAt(0);  

System.out.print("Enter The Second Character of Alphabet :- ");
char c = sc.next().charAt(0);  
 
 
  while ( ch <= c )
  {
	 
	System.out.println(ch);
	ch+=2;
	 
  }
   
  }

}