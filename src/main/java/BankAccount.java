/**
 * The BankAccount class, describes the general data of an account, such as account number and status.
 * @author Daniela Lozano
 */
public class BankAccount {
    private int accountNumber;
    protected boolean actived;

    public BankAccount(int accountNumber, boolean actived) {
        this.accountNumber = accountNumber;
        this.actived = actived;
    }

    /**
     *This is the get method, of the private variable of actived
     * @return actived, gives the status of the bank account.
     */
    public boolean getActivated() {
        return actived;
    }

    /**
     * Assigns value with the set method, to the actived variable
     * @param actived receives the status to assign the value
     */
    public void setActivated(boolean actived) {
        this.actived = actived;
    }

    /**
     * Prints the data of the actived variable, showing the status of the bank account
     * @return a message with the status of the bank account
     */
    @Override
    public String toString() {
        String accounStatus;
        if (getActivated()) {
            accounStatus = "Active";
        } else {
            accounStatus = "Inactive";
        }
        return "Your savings account is: " + accounStatus;
    }
}
