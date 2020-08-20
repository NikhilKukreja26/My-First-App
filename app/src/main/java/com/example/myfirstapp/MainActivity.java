package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.content.Intent.ACTION_DIAL;
import static android.content.Intent.ACTION_VIEW;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    Button dialNumber, showToast, showLocation, viewIntent, openWebPage, letGetsPro ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textview);
        dialNumber = (Button) findViewById(R.id.dialNumber);
        showToast = (Button) findViewById(R.id.showToast);
        showLocation = (Button) findViewById(R.id.showLocation);
        viewIntent = (Button) findViewById(R.id.viewIntent);
        openWebPage = (Button) findViewById(R.id.openWebPage);
        letGetsPro = (Button) findViewById(R.id.letGetsPro);

        dialNumber.setOnClickListener(this);
        showToast.setOnClickListener(this);
        showLocation.setOnClickListener(this);
        viewIntent.setOnClickListener(this);
        openWebPage.setOnClickListener(this);
        letGetsPro.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.dialNumber:
                Intent intent = new Intent(ACTION_DIAL, Uri.parse("tel: 7507242108"));
                startActivity(intent);
                break;

            case R.id.showToast:
                Intent intent2 = new Intent(MainActivity.this, OtherActivity.class);
                startActivity(intent2);
                break;

            case R.id.showLocation:
                Intent intent3 = new Intent(ACTION_VIEW, Uri.parse("geo: 19.2088889,73.1504735,17?z=13"));
                startActivity(intent3);
                break;

            case R.id.openWebPage:
                Intent intent4 = new Intent(ACTION_VIEW, Uri.parse("https://github.com/NikhilKukreja26"));
                startActivity(intent4);
                break;

            case R.id.viewIntent:
                Intent intent5 = new Intent(ACTION_VIEW);
                startActivity(intent5);
                break;

            case R.id.letGetsPro:
                Intent intent6 = new Intent(ACTION_VIEW);
                intent6.putExtra("KEY", "Hello from main activity");
                startActivity(intent6);
                break;
        }
    }
}