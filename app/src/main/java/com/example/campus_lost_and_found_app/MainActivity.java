package com.example.campus_lost_and_found_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnReportLost = findViewById(R.id.btnReportLost);
        Button btnReportFound = findViewById(R.id.btnReportFound);

        btnReportLost.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ReportLostActivity.class);
            startActivity(intent);
        });

        btnReportFound.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ReportFoundActivity.class);
            startActivity(intent);
        });
    }
}