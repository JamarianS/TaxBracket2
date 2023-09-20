import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tax Filing Status:");
        System.out.println("1. Single");
        System.out.println("2. Head of Household");
        System.out.println("3. Married Filing Jointly");
        System.out.println("4. Married Filing Separately");
        System.out.print("Enter your choice (1/2/3/4): ");

        int choice = scanner.nextInt();
        TaxBracket taxBracket = null;

        switch (choice) {
            case 1:
                taxBracket = new SingleTaxBracket();
                break;
            case 2:
                taxBracket = new HeadOfHouseholdTaxBracket();
                break;
            case 3:
                taxBracket = new MarriedJointlyTaxBracket();
                break;
            case 4:
                taxBracket = new MarriedSeparatelyTaxBracket();
                break;
            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }

        System.out.print("Enter your taxable income: ");
        double income = scanner.nextDouble();

        double taxOwed = taxBracket.calculateTax(income);

        System.out.println("Tax Owed: $" + taxOwed);
        scanner.close();
    }
}
