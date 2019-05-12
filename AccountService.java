package Project;

import java.util.ArrayList;

public class AccountService {
    private static ArrayList<Account> getAccounts() {
        return Accounts;
    }

    private static void setAccounts(ArrayList<Account> accounts) {
        Accounts = accounts;
    }

    private static ArrayList<Account> Accounts = new ArrayList<Account>();
    //GM
    Account GMAccount = new Account("GM","12345678",100,5,9999999,100000000,true);

    public AccountService() {
        Accounts.add(GMAccount);
    }


}
