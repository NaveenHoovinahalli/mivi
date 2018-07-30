package com.example.android.naveenproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText userNameET,passET;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userNameET = (EditText) findViewById(R.id.userNameET);
        passET = (EditText) findViewById(R.id.passwordET);
        loginBtn = (Button) findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginOperation();
            }
        });



        Toast.makeText(this,"TODO : Validate the username and password and authentication status should be saved locally ",Toast.LENGTH_SHORT).show();



    }

    private void loginOperation() {
        String userName = userNameET.getText().toString().trim();
        String password = passET.getText().toString().trim();

        if (!userName.isEmpty() & !password.isEmpty()){
            Intent intent = new Intent(LoginActivity.this,SplashActivity.class);
            startActivity(intent);
            finish();

        } else {
            Toast.makeText(this,"Please enter the details",Toast.LENGTH_SHORT).show();
        }
    }


}
