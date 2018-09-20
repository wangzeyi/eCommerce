package com.example.wang_.ecommerce.data;

import android.content.Context;

public class DataManager implements IDataManager {

    IDBHelper dbHelper;

    public DataManager(Context context) {
       dbHelper = new DBHelper(context);

    }


    @Override
    public void saveRegister(String name, String mobile, onResponseListener listener) {
       dbHelper.saveRegister(name, mobile, listener);
    }
}
