package com.example.wang_.ecommerce.data;

import android.content.Context;

import com.example.wang_.ecommerce.data.database.IDBHelper;
import com.example.wang_.ecommerce.data.database.ServerDBHelper;

public class DataManager implements IDataManager {

    IDBHelper dbHelper;

    public DataManager(Context context, String url) {
       //dbHelper = new DBHelper(context);
       dbHelper = new ServerDBHelper(url);
    }


    @Override
    public void Register(String name, String mobile, onResponseListener listener) {
       dbHelper.Register(name, mobile, listener);

    }
}
