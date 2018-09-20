package com.example.wang_.ecommerce.main;

import android.util.Log;
import android.view.View;

import com.example.wang_.ecommerce.R;
import com.example.wang_.ecommerce.data.DataManager;
import com.example.wang_.ecommerce.data.IDataManager;
import com.example.wang_.ecommerce.utils.AppController;

public class Presenter implements IPresenter, IDataManager.onResponseListener{

    IView view;
    IDataManager dataManager;
    String url_register = "http://rjtmobile.com/aamir/e-commerce/android-app/shop_reg.php";

    public Presenter(MainActivity mainActivity) {
        this.view = mainActivity;
        dataManager = new DataManager(mainActivity, url_register);
    }

    @Override
    public void onClickHandler(View v) {
        switch(v.getId()){
            case R.id.button_register:
                //view.showLog("hi");
                view.passRegister();
                break;
            case R.id.button_login:

                break;
            default:
                break;
        }
    }

    @Override
    public void passRegister(String name, String mobile) {
        dataManager.Register(name, mobile, this);
        //Log.d("MyTag", name+ " "+mobile);
    }


    @Override
    public void postRegister(String name, String mobile) {
        Log.d("MyTag", name+ " "+mobile);
    }
}
