package com.example.wang_.ecommerce.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.wang_.ecommerce.R;
import com.example.wang_.ecommerce.main.IView;

public class MainActivity extends AppCompatActivity implements IView {

    EditText txt_Name, txt_Mobile;
    Button button_Register, button_Login;
    IPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_Name = findViewById(R.id.editText_name);
        txt_Mobile = findViewById(R.id.editText_mobile);

        button_Register = findViewById(R.id.button_register);
        button_Login = findViewById(R.id.button_login);

        presenter = new Presenter(MainActivity.this);

    }


    @Override
    public void showLog(String s) {
        Log.d("MyTagMain", s);
    }

    @Override
    public void passRegister() {
        String name = txt_Name.getText().toString();
        String mobile = txt_Mobile.getText().toString();
        presenter.passRegister(name, mobile);
    }

    public void onClickHandler(View view) {
        presenter.onClickHandler(view);
    }



}
