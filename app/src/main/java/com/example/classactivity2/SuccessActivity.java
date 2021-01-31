package com.example.classactivity2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SuccessActivity extends AppCompatActivity {


    private TextView city_name;
    private TextView description;
    private TextView text_high;
    private TextView text_low;
    private TextView text_feels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        Intent intent = getIntent();
        city_name = findViewById(R.id.city_name);
        city_name.setText(intent.getStringExtra("city") +", " + intent.getStringExtra("country"));
        description = findViewById(R.id.description);
        description.setText(intent.getStringExtra("description"));
        text_high = findViewById(R.id.text_high);
        text_high.setText(intent.getStringExtra("high") + "F");
        text_low = findViewById(R.id.text_low);
        text_low.setText(intent.getStringExtra("low") + "F");
        text_feels = findViewById(R.id.text_feels);
        text_feels.setText(intent.getStringExtra("feels") + "F");
    }
}