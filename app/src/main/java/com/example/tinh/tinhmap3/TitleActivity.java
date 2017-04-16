package com.example.tinh.tinhmap3;


import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;

public class TitleActivity extends AppCompatActivity {

    private Button btnCreate;
    private Button btnJoin;
    private Button btnHelp;
    private Button btnTheme;

    public View view;
    public static String colorTheme = "grey";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);
        view = this.getWindow().getDecorView();
        changeTheme();

        btnCreate = (Button) findViewById(R.id.create_button);
        //btnCreate.setOnClickListener(this);
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        //startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                        Intent intent = new Intent(TitleActivity.this, MapsActivity.class);

                        startActivity(intent);

            }
        });
        btnJoin = (Button) findViewById(R.id.join_button);
        //btnJoin.setOnClickListener(this);
        btnJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        //startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                        Intent intent = new Intent(TitleActivity.this, JoinActivity.class);

                        startActivity(intent);


            }
        });
        btnTheme = (Button) findViewById(R.id.theme_button);
        //btnJoin.setOnClickListener(this);
        btnTheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                Intent intent = new Intent(TitleActivity.this, ThemeActivity.class);

                startActivity(intent);


            }
        });


        //Toast.makeText(this, "button set", Toast.LENGTH_LONG).show();
    }

    public void changeTheme()
    {
        //view.setBackgroundResource(R.color.colorTheme);
    }



    /**
     * onClick checks which button has been clicked and
     processes button instruction
     * @param v

    public void onClick(View v){

        switch (v.getId()) {


            case R.id.create_button:
                Intent intent = new Intent(TitleActivity.this, MapsActivity.class);
                startActivity(intent);
                break;

            case R.id.join_button:
                intent = new Intent(TitleActivity.this, JoinActivity.class);
                startActivity(intent);
                break;

            case R.id.help_button:

                break;


        }

    }

*/
















}

