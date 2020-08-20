package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        Toast.makeText(this, R.string.landed_other_activty, Toast.LENGTH_SHORT).show();

        Bundle bundle = getIntent().getExtras();
        String str = bundle != null ? bundle.getString("KEY") : null;

        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();

    }
}