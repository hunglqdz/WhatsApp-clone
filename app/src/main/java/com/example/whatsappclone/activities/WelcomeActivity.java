package com.example.whatsappclone.activities;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.whatsappclone.R;

public class WelcomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Button startButton = findViewById(R.id.start_btn);
        startButton.setOnClickListener(v -> {
            Intent intent = new Intent(WelcomeActivity.this, RegisterActivity.class);
            startActivity(intent);
            finish();
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Resources resources = getResources();
        String[] languages = resources.getStringArray(R.array.languages);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item, languages);
        AutoCompleteTextView autoComplete = findViewById(R.id.auto_complete);
        autoComplete.setAdapter(adapter);
    }
}