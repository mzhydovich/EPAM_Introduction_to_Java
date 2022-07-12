package Account;

import java.util.ArrayList;

public class Customer {

    String name;
    ArrayList<Account> accounts = new ArrayList<Account>();

    public Customer(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", accounts=" + accounts + "]";
    }

}
