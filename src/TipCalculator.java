
    import java.util.Scanner;
    public class TipCalculator {
        public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
             System.out.print("Enter the bill amount: ");
        double bill = scanner.nextDouble();double defaultTip = bill * 0.15;
        double defaultTotal = bill + defaultTip;
            System.out.println("\n--- Default 15% Tip ---");
        System.out.println("Tip amount: " + defaultTip);
        System.out.println("Total with tip: " + defaultTotal);
         System.out.print("\nEnter your custom tip percentage (e.g. 10 for 10%): ");
        double customPercent = scanner.nextDouble();
        
        double customTip = bill * (customPercent / 100);
        double customTotal = bill + customTip; System.out.println("\n--- Custom Tip ---");
        System.out.println("Tip amount: " + customTip);
        System.out.println("Total with tip: " + customTotal);

        scanner.close();
        }
    }
    
