/**
 * The SavingsAccount class, displays personal bank account information, inheriting from the BankAccount class,
 * and adding the interest rate
 * @author Daniela Lozano
 */
public class SavingsAccount extends BankAccount{
    private double interestRate = 0.5;

    public SavingsAccount(int accountNumber, boolean actived) {
        super(accountNumber, actived);
    }

    /**
     * This is the get method, of the private variable of interestRate, this gives the value of the interest rate
     * @return the value of the interest rate of the bank account
     */
    public double getInterestRate() {
        return interestRate;
    }


}
