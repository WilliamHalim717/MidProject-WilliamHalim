package com.example.midprojeclatihan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.midprojeclatihan.databinding.ActivityMainBinding;
import com.example.midprojeclatihan.databinding.ActivityRegisterBinding;

public class Register extends AppCompatActivity implements View.OnClickListener {

    private ActivityRegisterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btnRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()== binding.btnRegister.getId()){
            String username = binding.ipUsername.getText().toString();
            String email = binding.editText.getText().toString();
            String password = binding.editText2.getText().toString();
            String c_password = binding.editText3.getText().toString();

            if(username.isEmpty()) binding.ipUsername.setError("Username kosong");
            else if(email.isEmpty()) binding.editText.setError("Email kosong");
            else if(password.isEmpty()) binding.editText2.setError("Password Kosong");
            else if(c_password.isEmpty()) binding.editText3.setError("Password kosong");

            else if(username.isEmpty() || email.isEmpty() || password.isEmpty() || c_password.isEmpty()){
                Toast.makeText(this, "Masih kosong",Toast.LENGTH_SHORT).show();
            }
            else Toast.makeText(this,"Berhasil",Toast.LENGTH_SHORT).show();
        }
    }
}