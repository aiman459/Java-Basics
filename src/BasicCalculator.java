import java.util.Scanner;
public class BasicCalculator{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

         double firstNumber, secondNumber;
        char sign;
        System.out.println("=== Basic Calculator (One Operation) ===");
        System.out.print("Type your first number: ");
        firstNumber = scanner.nextDouble();

         System.out.print("type your second number: ");
        secondNumber = scanner.nextDouble();
        System.out.print("Enter the operation (+, -, *, /): ");
        sign = scanner.next().charAt(0);

        if (sign == '+') {
            System.out.println("Result: " + (firstNumber + secondNumber));
        } else if (sign == '-') {
            System.out.println("Result: " + (firstNumber - secondNumber));
        } else if (sign == '*') {
            System.out.println("Result: " + (firstNumber * secondNumber));
        } else if (sign == '/') {
            if (secondNumber == 0) {
                System.out.println("Error! Cannot divide by zero.");
            } else {
                System.out.println("Result: " + (firstNumber / secondNumber));
            }
        } else {
            System.out.println("Operation not recognized. Please try again.");
        }
 scanner.close();
    
    }
}
