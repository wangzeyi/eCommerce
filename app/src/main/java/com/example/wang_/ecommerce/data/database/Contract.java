package com.example.wang_.ecommerce.data.database;

import android.provider.BaseColumns;

public final class Contract {

    public Contract() {
    }

    public static abstract class ContractRegister implements BaseColumns{

        public static final String TABLE_NAME = "register";
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_MOBILE = "mobile";

    }

}
