package com.dhuli.bio_data;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class BioActivity extends AppCompatActivity {

     EditText name,surname,brithdate,mobileno,email,address,qualification,country,city,socialmedia,job,health;
     CheckBox code,reading,eating;
     RadioGroup gender;
     Button submit;
     public  static  List<String> hobbylist = new ArrayList<>();
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
                String s = surname.getText().toString();
                String b = brithdate.getText().toString();
                String m = mobileno.getText().toString();
                String e = email.getText().toString();
                String a = address.getText().toString();
                String q = qualification.getText().toString();
                String c = country.getText().toString();
                String C = city.getText().toString();
                String S = socialmedia.getText().toString();
                String j = job.getText().toString();
                String h = health.getText().toString();
                String co = code.getText().toString();
                String r = reading.getText().toString();
                String ea = eating.getText().toString();

                int id = gender.getCheckedRadioButtonId();
                RadioButton button = findViewById(id);

                hobbylist.clear();

                if (code.isChecked()){
                    hobbylist.add("code");
                }
                if (reading.isChecked()){
                    hobbylist.add("reading");
                }
                if (eating.isChecked()){
                    hobbylist.add("eating");
                }

                String hobby = "";

                for (int i = 0; i < hobbylist.size(); i++) {
                    hobby += hobbylist.get(i).toString()+"\n";
                }


                Intent intent  = new Intent(BioActivity.this,MainActivity.class);
                intent.putExtra("name",n);
                intent.putExtra("surname",s);
                intent.putExtra("brithdate",b);
                intent.putExtra("mobileno",m);
                intent.putExtra("email",e);
                intent.putExtra("address",a);
                intent.putExtra("qualification",q);
                intent.putExtra("country",c);
                intent.putExtra("city",C);
                intent.putExtra("socialmedia",S);
                intent.putExtra("job",j);
                intent.putExtra("health",h);
                intent.putExtra("code",co);
                intent.putExtra("reading",r);
                intent.putExtra("eating",ea);
                intent.putExtra("hobby",hobby);
                intent.putExtra("gender",button.getText().toString());
                startActivity(intent);
            }
        });


    }
}