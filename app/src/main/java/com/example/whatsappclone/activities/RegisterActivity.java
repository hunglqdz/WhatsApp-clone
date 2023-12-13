package com.example.whatsappclone.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.whatsappclone.R;
import com.example.whatsappclone.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {
    private ActivityRegisterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners(){
        binding.loginText.setOnClickListener(v->onBackPressed());
    }
}