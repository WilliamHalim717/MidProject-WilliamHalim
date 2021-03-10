package com.example.midprojeclatihan;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.midprojeclatihan.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;

    private final String username = "test@test.com";
    private final String password = "test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btnLogin.setOnClickListener(this);
        binding.register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == binding.btnLogin.getId()){
            String getUsername = binding.etUsername.getText().toString();
            String getPassword = binding.etPassword.getText().toString();

            if(getUsername.isEmpty()) binding.etUsername.setError("Username kosong");
            else if(getPassword.isEmpty()) binding.etPassword.setError("Password kosong");

            else if(getUsername.equals(username) && getPassword.equals(password)){
                Intent moveToHomePage = new Intent(this, HomePage.class);
                startActivity(moveToHomePage);

            } else Toast.makeText(this, "Wrong username or password", Toast.LENGTH_SHORT).show();
        }
        if(v.getId()== binding.register.getId()){
            Intent moveToRegister = new Intent(this, Register.class);
            startActivity(moveToRegister);
        }
    }
}