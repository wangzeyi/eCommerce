package com.example.wang_.ecommerce.data.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.wang_.ecommerce.data.IDataManager;

public class DBHelper implements IDBHelper {

    ECommerceDB eCommerceDB;
    SQLiteDatabase sqLiteDatabase;

    public DBHelper(Context context) {
        eCommerceDB = new ECommerceDB(context);
        sqLiteDatabase =  eCommerceDB.getWritableDatabase();
    }


    @Override
    public void Register(String name, String mobile, IDataManager.onResponseListener listener) {
        ContentValues values = new ContentValues();
        values.put(Contract.ContractRegister.COLUMN_NAME_NAME, name);
        values.put(Contract.ContractRegister.COLUMN_NAME_MOBILE, mobile);

        sqLiteDatabase.insert(Contract.ContractRegister.TABLE_NAME, null, values);

        listener.postRegister(name, mobile);
    }
}
