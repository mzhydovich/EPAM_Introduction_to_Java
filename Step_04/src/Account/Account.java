package Account;

public class Account implements Comparable<Account> {

    static int IDAccount = 1;
    int accountID;
    int balance;
    Status current;
    final int limit = -5000;

    public Account(int balance) {
        super();
        this.accountID = IDAccount;
        this.balance = balance;

        if (balance > 0) {
            this.current = Status.NOT_BLOCKED;
        } else {
            this.current = Status.BLOCKED;
        }
        IDAccount++;
    }

    public int getAccountID() {
        return accountID;
    }

    public int getLimit() {
        return limit;
    }

    public Status getCurrent() {
        return current;
    }

    public void setCurrent(Status current) {
        this.current = current;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [balance = " + balance + ", current = " + current + ", accountID = " + accountID + "]";
    }

    @Override
    public int compareTo(Account o) {
        return current.compareTo(o.getCurrent());
    }

}
