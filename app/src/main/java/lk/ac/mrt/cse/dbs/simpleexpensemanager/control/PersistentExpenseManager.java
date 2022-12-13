
package lk.ac.mrt.cse.dbs.simpleexpensemanager.control;

import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.AccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.TransactionDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.PersistentAccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.PersistentTransactionDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.model.Account;


public class PersistentExpenseManager extends ExpenseManager{
    public PersistentExpenseManager() {
        setup();
    }
  
 @Override
public void setup() {
    /*** Begin generating dummy data for SQLite implementation ***/

    AccountDAO AccDAO = new PersistentAccountDAO();
    setAccountsDAO(AccDAO);

    TransactionDAO TransDAO = new PersistentTransactionDAO();
    setTransactionsDAO(TransDAO);

  // adding account details 
    Account accOne = new Account("23567A", "Ceylonplc", "ThevarasaSangaran", 2345.67);
    Account accTwo = new Account("37689A", "hsbc", "Thayaparan Prasha", 60120.45);
    getAccountsDAO().addAccount(accountOne);
    getAccountsDAO().addAccount(accountTwo);
}
  


