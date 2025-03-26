package com.example.projectfinalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class activity_herbalinformation extends AppCompatActivity {
    Spinner myselect;
    TextView myfullname;

    Button myseemore;
    ImageView myandor,myindian,myturmeric,myginger,myhome,mylove,mypro,myshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_herbalinformation);

        myseemore = findViewById(R.id.seemoreBT);
        myselect = findViewById(R.id.selectherb);
        myfullname = findViewById(R.id.emailTV);
        myandor = findViewById(R.id.androIV);
        myindian = findViewById(R.id.indianIV);
        myturmeric = findViewById(R.id.turmericIV);
        myginger = findViewById(R.id.gingerIV);
        myhome = findViewById(R.id.homeInfoIV);
        mylove = findViewById(R.id.loveInfoIV);
        mypro = findViewById(R.id.proInfoIV);
        myshow = findViewById(R.id.imageshow);

        //Profile page ImageView
        mypro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Profile.class);
                startActivity(intent);
            }
        });

        //Step 3 spinner select herb
        myselect.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String sp1 = myselect.getSelectedItem().toString();
                switch (sp1) {
                    case "ฟ้าทะลายโจร": {
                        myshow.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.andrographispaniculata));
                        myseemore.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(),AndrographiPaniculata.class);
                                startActivity(intent);
                            }
                        });

                        break;
                    }
                    case "กระชาย": {
                        myshow.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.boesenbergiarotunda));
                        myseemore.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(),Boesenbergia_rotunda.class);
                                startActivity(intent);
                            }
                        });

                        break;
                    }
                    case "ขิง": {
                        myshow.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.ginger1));
                        myseemore.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(),Ginger.class);
                                startActivity(intent);
                            }
                        });

                        break;
                    }
                    case "กะเพราแดง": {
                        myshow.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.holybasil));
                        myseemore.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(),Holy_Basil.class);
                                startActivity(intent);
                            }
                        });

                        break;
                    }
                    case "มะขามป้อม": {
                        myshow.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.indiangooseberry));
                        myseemore.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(),Indian_Gooseberry.class);
                                startActivity(intent);
                            }
                        });

                        break;
                    }
                    case "ตะไคร้": {
                        myshow.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.lemongrass1));
                        myseemore.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(),Lemongrass.class);
                                startActivity(intent);
                            }
                        });

                        break;
                    }
                    case "ชะเอมเทศ": {
                        myshow.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.licoriceroot));
                        myseemore.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(),Licorice_Root.class);
                                startActivity(intent);
                            }
                        });

                        break;
                    }
                    case "หญ้าหนวดแมว": {
                        myshow.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.orthosiphonaristatus));
                        myseemore.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(),Orthosiphon_aristatus.class);
                                startActivity(intent);
                            }
                        });

                        break;
                    }
                    case "ใบเตย": {
                        myshow.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.pandanleaf));
                        myseemore.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(),Pandan_Leaf.class);
                                startActivity(intent);
                            }
                        });

                        break;
                    }
                    case "ขมิ้นชัน": {
                        myshow.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.turmeric1));
                        myseemore.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(),Turmeric.class);
                                startActivity(intent);
                            }
                        });

                        break;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

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