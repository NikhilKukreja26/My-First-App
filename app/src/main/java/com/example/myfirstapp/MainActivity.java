package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    Button click_me, click_me_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textview);
        click_me = (Button) findViewById(R.id.click_me);
        click_me_2 = (Button) findViewById(R.id.click_me2);

        click_me.setOnClickListener(this);
        click_me_2.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.click_me:
                Log.d("tag", "onClick: First Button Click");
                textView.setText(R.string.first_button_clecked);
                break;

            case R.id.click_me2:
                Log.d("tag", "onClick: Second Button Click");
                textView.setText(R.string.second_button_clicked);
                break;
        }
    }
}