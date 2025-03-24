package com.example.projectfinalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class activity_herbalinformation extends AppCompatActivity {
    Spinner myselect;
    TextView myfullname;
    ImageView myandor,myindian,myturmeric,myginger,myhome,mylove,mypro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_herbalinformation);

        myselect = findViewById(R.id.selectherb);
        myfullname = findViewById(R.id.emailTV);
        myandor = findViewById(R.id.androIV);
        myindian = findViewById(R.id.indianIV);
        myturmeric = findViewById(R.id.turmericIV);
        myginger = findViewById(R.id.gingerIV);
        myhome = findViewById(R.id.homeInfoIV);
        mylove = findViewById(R.id.loveInfoIV);
        mypro = findViewById(R.id.proInfoIV);

        //Step 3 spinner select herb


        //Step 3 myhome imageview go to andro page
        myhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Step 4
                Intent intent = new Intent(getApplicationContext(),activity_herbalinformation.class);
                startActivity(intent);
            }
        });

        //Step 3 myandro imageview go to andro page
        myandor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Step 4
                Intent intent = new Intent(getApplicationContext(),AndrographiPaniculata.class);
                startActivity(intent);
            }
        });
        //Step 3 myindian imageview go to indian page
        myindian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Step 4
                Intent intent = new Intent(getApplicationContext(),Indian_Gooseberry.class);
                startActivity(intent);
            }
        });
        //Step 3 myginger imageview go to indian page
        myginger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Step 4
                Intent intent = new Intent(getApplicationContext(),Ginger.class);
                startActivity(intent);
            }
        });
        //Step 3 myturmeric imageview go to indian page
        myturmeric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Step 4
                Intent intent = new Intent(getApplicationContext(),Turmeric.class);
                startActivity(intent);
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}