package com.example.wang_.ecommerce.data.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ECommerceDB extends SQLiteOpenHelper{

    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";
    private static final String SQL_CREATE_REGISTER =
            "CREATE TABLE " + Contract.ContractRegister.TABLE_NAME + " (" +
                    Contract.ContractRegister._ID + " INTEGER PRIMARY KEY," +
                    Contract.ContractRegister.COLUMN_NAME_NAME + TEXT_TYPE + COMMA_SEP +
                    Contract.ContractRegister.COLUMN_NAME_MOBILE + TEXT_TYPE + " )";


    public ECommerceDB(Context context) {
        super(context, "ECommerceDB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_REGISTER);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
