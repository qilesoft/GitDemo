package com.yxcskj.gitdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int number = 0;
    private TextView textNum;
    private Button button_add,button_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textNum = findViewById(R.id.textNum);
        textNum.setText(String.valueOf(number));
        button_add = findViewById(R.id.button_add);
        button_sub = findViewById(R.id.button_sub);
        button_add.setOnClickListener(this);
        button_sub.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_add:
                textNum.setText(String.valueOf(++number));
                break;
            case R.id.button_sub:
                textNum.setText(String.valueOf(--number));
                break;
        }
    }
}