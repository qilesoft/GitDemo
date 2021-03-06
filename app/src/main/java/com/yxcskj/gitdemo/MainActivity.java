package com.yxcskj.gitdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * 这个是一个Git Dmeo
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int number = 0;
    private TextView textNum;
    private Button button_add, button_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState!=null){
            number = savedInstanceState.getInt("number");
        }

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

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("number", number);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menu_reset) {
            number = 0;
            textNum.setText(number);
        }
        return super.onOptionsItemSelected(item);
    }
}