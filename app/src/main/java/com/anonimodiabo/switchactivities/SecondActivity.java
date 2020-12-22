package com.anonimodiabo.switchactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button btnIos,btnAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnIos=findViewById(R.id.btn_ios);
        btnAndroid=findViewById(R.id.btn_android);

        btnIos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(i);
            }
        });

        btnAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
