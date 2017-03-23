package com.akexorcist.googledirection.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BackOfficeActivity extends AppCompatActivity implements View.OnClickListener {

    //Explicit
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_office);

        //Initial View
        button = (Button)findViewById(R.id.btnBackOffice);

        //Button Controller
        button.setOnClickListener(BackOfficeActivity.this);



    }   // Main Method

    @Override
    public void onClick(View view) {

        if (view == button) {
            Intent intent = new Intent(BackOfficeActivity.this, PhotoActivity.class);
            intent.putExtra("Login", getIntent().getBooleanArrayExtra("Login"));
            startActivity(intent);
            finish();
        }

    }
}   // Main Class
