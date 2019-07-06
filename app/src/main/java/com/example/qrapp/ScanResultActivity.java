package com.example.qrapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ScanResultActivity extends AppCompatActivity {

    TextView txtScanResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_result);
        txtScanResult = (TextView) findViewById(R.id.txtScanResult); /* Find TextView and initialize it to object */
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String scanResult = extras.getString("ScanResult"); /* Retrieving text of QR Code */
            txtScanResult.setText(scanResult);
        }
    }
}