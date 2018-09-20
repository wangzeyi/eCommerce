package com.example.wang_.ecommerce.data;

public interface IDataManager extends IDBHelper{
    //void saveRegister(String name, String mobile);

    interface onResponseListener{
        void postRegister(String name, String mobile);
    }

}
