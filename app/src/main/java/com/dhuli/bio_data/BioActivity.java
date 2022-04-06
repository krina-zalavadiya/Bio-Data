package com.dhuli.bio_data;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {

     TextView name,surname,brithdate,mobileno,email,address,qualification,country,city,socialmedia,job,health;
     CheckBox code,reading,eating;
     RadioGroup gender;
     Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        name = findViewById(R.id.name);
        surname = findViewById(R.id.surname);
        brithdate = findViewById(R.id.brithdate);
        mobileno = findViewById(R.id.mobileno);
        email = findViewById(R.id.email);
        address = findViewById(R.id.address);
        qualification = findViewById(R.id.qualification);
        country = findViewById(R.id.country);
        city = findViewById(R.id.city);
        socialmedia = findViewById(R.id.socialmedia);
        job = findViewById(R.id.job);
        health = findViewById(R.id.health);
        code = findViewById(R.id.code);
        reading = findViewById(R.id.reading);
        eating = findViewById(R.id.eating);
        gender = findViewById(R.id.gender);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n = name.getText().toString();
                Intent intent  = new Intent(BioActivity.this,MainActivity.class);
                intent.putExtra("name",n);
                startActivity(intent);
            }
        });


    }
}