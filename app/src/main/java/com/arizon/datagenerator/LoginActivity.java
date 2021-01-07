package com.arizon.datagenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void signup(View view) {
        String text = ((TextView)view).getText().toString();
        if (text.toUpperCase().equals("SIGN UP")) {
            ((Button)findViewById(R.id.login_signup_button)).setText(getResources().getString(R.string.signup));
            ((TextView)view).setText(getResources().getString(R.string.login));
            findViewById(R.id.retype_password).setVisibility(View.VISIBLE);
        }else {
            ((Button)findViewById(R.id.login_signup_button)).setText(getResources().getString(R.string.login));
            ((TextView)view).setText(getResources().getString(R.string.signup));
            findViewById(R.id.retype_password).setVisibility(View.GONE);
        }
    }
}