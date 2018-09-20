package com.example.wang_.ecommerce.main;

import android.util.Log;
import android.view.View;

import com.example.wang_.ecommerce.R;
import com.example.wang_.ecommerce.data.DataManager;
import com.example.wang_.ecommerce.data.IDataManager;

public class Presenter implements IPresenter, IDataManager.onResponseListener{

    IView view;
    IDataManager dataManager;

    public Presenter(MainActivity mainActivity) {
        this.view = mainActivity;
        dataManager = new DataManager(mainActivity);
    }

    @Override
    public void onClickHandler(View v) {
        switch(v.getId()){
            case R.id.button_register:
                //view.showLog("hi");
                view.passRegister();

                break;
            default:
                break;
        }
    }

    @Override
    public void passRegister(String name, String mobile) {
        dataManager.saveRegister(name, mobile, this);
        //Log.d("MyTag", name+ " "+mobile);
    }


    @Override
    public void postRegister(String name, String mobile) {
        Log.d("MyTag", name+ " "+mobile);
    }
}
