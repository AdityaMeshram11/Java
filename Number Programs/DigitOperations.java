import java.util.Scanner;

public class DigitOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();   ///1234

        int originalNumber = number;  // Keep the original number for later use //temp variable  //1234
        int lastDigit = number % 10;  // Extract the last digit  //only extract last digit // 4
        int firstDigit = 0;   //create variablefor first digit // 0
        int productOfMiddleDigits = 1;  // Initialize product as 1 //for multiplication  //1

        // Remove the last digit for middle digits processing
        number /= 10;   //123

        // Find the first digit and calculate the product of the middle digits
        while (number > 0)
			{
            if (number / 10 == 0)  //if num / 10 == 0 then it is first
			{
                firstDigit = number;  // The last remaining digit is the first digit  // give that value to the firstdigit variable
            } else {
                int middleDigit = number % 10;  // Extract the current last digit (middle digit)
                productOfMiddleDigits *= middleDigit;  // Multiply it to the product
            }
            number /= 10;  // Remove the last digit
        }

        int sumFirstLast = firstDigit + lastDigit;

        // Output the results
        System.out.println("First digit: " + firstDigit);
        System.out.println("Last digit: " + lastDigit);
        System.out.println("Sum of first and last digit: " + sumFirstLast);

        if (originalNumber > 9)
		{
            System.out.println("Product of middle digits: " + productOfMiddleDigits);
        }
		else 
		{
            System.out.println("No middle digits to calculate the product.");
        }
    }
}
