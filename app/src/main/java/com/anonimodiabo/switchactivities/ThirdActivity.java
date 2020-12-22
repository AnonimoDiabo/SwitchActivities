package com.anonimodiabo.switchactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    Button btnAndroid, btnWindows;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        btnAndroid=findViewById(R.id.btn_android);
        btnWindows=findViewById(R.id.btn_windows);

        btnAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ThirdActivity.this,MainActivity.class);
                startActivity(i);
            }
        });

        btnWindows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ThirdActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });
    }
}
