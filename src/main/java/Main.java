import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Main class in which the classes are instantiated, and the methods of the class, employee, strawberry and savingsAccount are called.
 * @author Daniela Lozano
 */
public class Main {
    public static void main(String[] args){

        System.out.println("Welcome, in this system you'll find the personal information of our employees \n");

        Date dateLalo = new Date(90, Calendar.FEBRUARY,2);

        Employee tester = new Employee("Lalo", "Torres", "Gomez", dateLalo, 1.70F, 2100000, "QA");
        System.out.println(tester);

        ArrayList<String> strawberryColors = new ArrayList<>();
        strawberryColors.add("Red");
        strawberryColors.add("Green");

        System.out.println("\nPurchases made by the employee in the company, with employee code");

        Strawberry strawberries = new Strawberry("Strawberry", 1.5F, strawberryColors, 8000, 2);
        System.out.println(strawberries);
        System.out.println("Available colors: " + strawberries.getColors());

        System.out.println("\nAssociated bank account ");

        SavingsAccount savingAccountLalo = new SavingsAccount(3587854, true);
        System.out.println(savingAccountLalo);
        System.out.println("The interest rate of the bank account: " + savingAccountLalo.getInterestRate());
    }
}
