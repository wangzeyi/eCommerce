package com.example.wang_.ecommerce.main;

import android.view.View;

public interface IPresenter {

    void onClickHandler(View view);
    void passRegister(String name, String mobile);
}
