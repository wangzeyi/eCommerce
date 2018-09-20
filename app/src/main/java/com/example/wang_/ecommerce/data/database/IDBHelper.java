package com.example.wang_.ecommerce.data.database;

import com.example.wang_.ecommerce.data.IDataManager;

public interface IDBHelper {
    void Register(String name, String mobile, IDataManager.onResponseListener listener);

}
