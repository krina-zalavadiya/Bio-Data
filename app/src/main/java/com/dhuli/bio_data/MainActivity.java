package com.dhuli.bio_data;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView name_txt, surname_txt, brithdate_txt, mobileno_txt, email_txt,address_txt, qualification_txt, country_txt, city_txt, socialmedia_txt, job_txt, health_txt,hobby_txt, gender_txt;
    List<String> hobbylist;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name_txt = findViewById(R.id.name_txt);
        surname_txt = findViewById(R.id.surname_txt);
        brithdate_txt = findViewById(R.id.brithdate_txt);
        mobileno_txt = findViewById(R.id.mobileno_txt);
        email_txt = findViewById(R.id.email_txt);
        address_txt = findViewById(R.id.address_txt);
        qualification_txt = findViewById(R.id.qualification_txt);
        country_txt = findViewById(R.id.country_txt);
        city_txt = findViewById(R.id.city_txt);
        socialmedia_txt = findViewById(R.id.socialmedia_txt);
        job_txt = findViewById(R.id.job_txt);
        health_txt = findViewById(R.id.health_txt);
        hobby_txt = findViewById(R.id.hobby_txt);

        gender_txt = findViewById(R.id.gender_txt);

        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");
        String brithdate = getIntent().getStringExtra("brithdate");
        String mobileno = getIntent().getStringExtra("mobileno");
        String email = getIntent().getStringExtra("email");
        String address = getIntent().getStringExtra("address");
        String qualification = getIntent().getStringExtra("qualification");
        String country = getIntent().getStringExtra("country");
        String city = getIntent().getStringExtra("city");
        String socialmedia = getIntent().getStringExtra("socialmedia");
        String job = getIntent().getStringExtra("job");
        String hobby = getIntent().getStringExtra("hobby");
        String health = getIntent().getStringExtra("health");
        String gender = getIntent().getStringExtra("gender");

        name_txt.setText("" + name);
        surname_txt.setText("" + surname);
        brithdate_txt.setText("" + brithdate);
        mobileno_txt.setText("" + mobileno);
        email_txt.setText("" + email);
        address_txt.setText("" + address);
        qualification_txt.setText("" + qualification);
        country_txt.setText("" + country);
        city_txt.setText("" + city);
        socialmedia_txt.setText("" + socialmedia);
        job_txt.setText("" + job);
        hobby_txt.setText("" +hobby);
        health_txt.setText("" +health);
        gender_txt.setText(gender);


    }

}
