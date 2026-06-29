package com.example.dclassicsbooks.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.dclassicsbooks.R;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import android.text.Html;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        Toast.makeText(this, "LoginActivity running", Toast.LENGTH_SHORT).show();

        TextView txtRegister = findViewById(R.id.txtRegister);

        txtRegister.setText(
                Html.fromHtml("<u>Register</u>", Html.FROM_HTML_MODE_LEGACY)
        );

        txtRegister.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this,
                    RegisterActivity.class);
            startActivity(intent);
        })

//        etUsername = findViewById(R.id.etUsername);
//        etPassword = findViewById(R.id.etPassword);
//        btnLogin = findViewById(R.id.btnLogin);
//
//        btnLogin.setOnClickListener(v -> {
//            String username = etUsername.getText().toString().trim();
//            String password = etPassword.getText().toString().trim();
//
//            if(username.isEmpty() || password.isEmpty()){
//                Toast.makeText(this,
//                        "Please fill all fields!",
//                        Toast.LENGTH_SHORT).show();
//            }
//            else{
//                Toast.makeText(this,
//                        "Login successful!",
//                        Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}