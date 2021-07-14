package com.example.customlistviewexample;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class CustomListViewExampleActivity extends AppCompatActivity {
    private List<Language> listLanguage;
    private ListView listView;
    ImageView icon_right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_list_view_activity);
        icon_right = (ImageView) findViewById(R.id.right_icon);
        listView = (ListView) findViewById(R.id.idListView);
        listLanguage = new ArrayList<>();
        listLanguage.add(new Language(1, "Nguyễn Thế viễn "));
        listLanguage.add(new Language(2, "Ngô Thanh "));
        listLanguage.add(new Language(3, "sơn Tùng "));
        listLanguage.add(new Language(4, "MTP"));
        listLanguage.add(new Language(5, "Viễn"));
        listLanguage.add(new Language(6, "Thầy Huy"));


        LanguageAdapter adapter = new LanguageAdapter(this, R.layout.item_custom_list_view, listLanguage);
        listView.setAdapter(adapter);
        icon_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( CustomListViewExampleActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });


    }
}