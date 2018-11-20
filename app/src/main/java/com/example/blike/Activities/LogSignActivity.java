package com.example.blike.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.blike.R;

public class LogSignActivity extends AppCompatActivity {

    Button btnSign;
    Button btnLog;
    EditText et1Log;
    EditText et2Log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_sign);

    btnSign = findViewById(R.id.btnSign);
    btnLog = findViewById(R.id.btnLog);
    et1Log = findViewById(R.id.et1Log);
    et2Log = findViewById(R.id.et2Log);


    btnSign.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent = new Intent(LogSignActivity.this,ManagerActivity.class);
            startActivity(intent);
        }
    });

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(et1Log.getText().toString().equals("albert@gmail.com")&&et2Log.getText().toString().equals("albert")){
                Intent intent = new Intent(LogSignActivity.this,ManagerActivity.class);
                startActivity(intent);

                }
            }
        });


    }



}
