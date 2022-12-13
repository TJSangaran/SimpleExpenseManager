
package lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lk.ac.mrt.cse.dbs.simpleexpensemanager.Constants;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.TransactionDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.model.Account;


public class PersistentTransactionDAO implements TransactionDAO{
    SQLiteDatabase dbManager;
    java.io.File readfile = Constants.CONTEXT.getFilesDir();
    public PersistentTransactionDAO()
    {
        dbManager = SQLiteDatabase.openOrCreateDatabase(file.getAbsolutePath() + "/tjsangaran.sqlite", null);
        dbManager.execSQL("CREATE TABLE IF NOT EXISTS InfoTransection(accountNo VARCHAR(30),expenseType VARCHAR(20),amount NUMERIC(15,2), date_value Date);");
    }
}
