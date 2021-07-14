package com.example.customlistviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etEmail, etPassword;
    TextView tvRegister;
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail = (EditText) findViewById(R.id.et_email);
        etPassword = (EditText) findViewById(R.id.et_passwword);
        btnLogin = (Button) findViewById(R.id.btn_login);
        tvRegister = (TextView) findViewById(R.id.tv_register);



        tvRegister.setOnClickListener(v -> {
            Intent i = new Intent( MainActivity.this, RegisterActivity.class);
            startActivity(i);
        });

        btnLogin.setOnClickListener(v -> {
            if (etEmail.getText().length() != 0 && etPassword.getText().length() != 0) {
                if (etEmail.getText().toString().equals("vien1@gmail.com") && etPassword.getText().toString().equals("12345")) {
                    Intent intent = new Intent(MainActivity.this, CustomListViewExampleActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
                }
            }else{
                Toast.makeText(MainActivity.this, "Mời bạn nhập đủ thông tin", Toast.LENGTH_SHORT).show();
            }
        });


    }
}