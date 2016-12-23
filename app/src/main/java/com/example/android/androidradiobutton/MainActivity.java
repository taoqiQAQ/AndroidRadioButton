package com.example.android.androidradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioButton man = (RadioButton) findViewById(R.id.man);
        man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = "您选择的性别为:男";
                EditText manedittext = (EditText) findViewById(R.id.EditText01);
                manedittext.setText("");
                manedittext.append(result);
            }
        });

        RadioButton woman = (RadioButton) findViewById(R.id.woman);
        woman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = "您选择的性别为:女";
                EditText manedittext = (EditText) findViewById(R.id.EditText01);
                manedittext.setText("");
                manedittext.append(result);
            }
        });

    }
}
