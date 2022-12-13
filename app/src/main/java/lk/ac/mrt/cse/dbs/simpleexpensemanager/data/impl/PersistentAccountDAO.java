
package lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.Constants;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.AccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.exception.InvalidAccountException;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.model.Account;
import  android.database.sqlite.*;

public class PersistentAccountDAO implements AccountDAO {
    SQLiteDatabase dbManager;
    java.io.File readfile = Constants.CONTEXT.getFilesDir();
    public PersistentAccountDAO()
    {
        dbManager = SQLiteDatabase.openOrCreateDatabase(readfile.getAbsolutePath() + "/tjsangaran.sqlite", null);
        dbManager.execSQL("CREATE TABLE IF NOT EXISTS InfoACC(accountNo VARCHAR(30),bankName VARCHAR(50),accountHolderName VARCHAR(30), balance NUMERIC(15,2));");
    }
   @Override
    public void addAccount(Account account) {
        dbManager.execSQL("INSERT INTO InfoACC VALUES('"+account.getAccountNo()+"','"+account.getBankName()+"','"+account.getAccountHolderName()+"','"+account.getBalance()+"');");
    }

    @Override
    public void removeAccount(String accountNo) throws InvalidAccountException {
        dbManager.execSQL("DELETE FROM InfoACC WHERE accountNo='"+accountNo+"';");
    }
    
}
