package com.dhuli.bio_data;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView name_txt,surname,brithdate,mobileno,email,address,qualification,country,city,socialmedia,job,health;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            name_txt = findViewById(R.id.name);

            String name = getIntent().getStringExtra("name");

            name_txt.setText(":"+name);


    }
}