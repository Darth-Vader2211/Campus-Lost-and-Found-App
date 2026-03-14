package com.example.campus_lost_and_found_app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class ReportFoundActivity extends AppCompatActivity {

    private TextInputEditText etItemName, etDescription, etLocation;
    private Button btnSelectDate, btnUploadImage, btnSubmitReport;
    private TextView tvSelectedDate;
    private ImageView ivItemImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_found);
        
        // Basic back button in Action Bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Report Found Item");
        }

        // Initialize views
        etItemName = findViewById(R.id.etItemName);
        etDescription = findViewById(R.id.etDescription);
        etLocation = findViewById(R.id.etLocation);

        btnSelectDate = findViewById(R.id.btnSelectDate);
        tvSelectedDate = findViewById(R.id.tvSelectedDate);
        
        ivItemImage = findViewById(R.id.ivItemImage);
        btnUploadImage = findViewById(R.id.btnUploadImage);

        btnSubmitReport = findViewById(R.id.btnSubmitReport);

        // Placeholder for Date Picker
        btnSelectDate.setOnClickListener(v -> {
            Toast.makeText(this, "Date picker triggered", Toast.LENGTH_SHORT).show();
            // TODO: Implement DatePickerDialog
            tvSelectedDate.setText("Date: YYYY-MM-DD");
        });

        // Placeholder for Image Upload
        btnUploadImage.setOnClickListener(v -> {
            Toast.makeText(this, "Image picker triggered", Toast.LENGTH_SHORT).show();
            // TODO: Implement Image selection logic
        });

        // Placeholder for Submit
        btnSubmitReport.setOnClickListener(v -> {
            String itemName = etItemName.getText().toString().trim();
            if(itemName.isEmpty()) {
                etItemName.setError("Item name is required");
                return;
            }
            Toast.makeText(this, "Found item report submitted successfully!", Toast.LENGTH_SHORT).show();
            // TODO: Implement Firebase saving logic
            finish();
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
