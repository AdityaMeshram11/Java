import java.util.Scanner;
class DoWhileAlphabetAltrnate{
 public static void main (String[]args)
 {
	 
 Scanner sc = new Scanner (System.in);

System.out.print("Enter The start Character of Alphabet :- "); 
char ch = sc.next().charAt(0);  

System.out.print("Enter The end Character of Alphabet :- ");
char c = sc.next().charAt(0);  
 
 
 do 
  {
	 
	System.out.println(ch);
	ch+=2;
	 
  }
  while ( ch <= c );
  }

}