import java.util.Scanner;
import java.time.Year;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentYear = Year.now().getValue();
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        int age = currentYear - birthYear;   
             System.out.println("You are approximately " + age + " years old.");
             scanner.close();

    }


}

