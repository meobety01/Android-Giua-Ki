package com.example.customlistviewexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    TextView dangxuat;
    ImageView ic_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        ic_back = (ImageView) findViewById(R.id.left_icon);
        dangxuat = (TextView) findViewById(R.id.toobar2);
        dangxuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( LoginActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
        ic_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( LoginActivity.this, CustomListViewExampleActivity.class);
                startActivity(i);
            }
        });
    }
}