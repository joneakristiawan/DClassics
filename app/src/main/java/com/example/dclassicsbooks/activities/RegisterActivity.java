package com.example.dclassicsbooks.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.dclassicsbooks.R;
import com.example.dclassicsbooks.utils.ToastHelper;

public class RegisterActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        TextView txtLogin = findViewById(R.id.txtLogin);

        txtLogin.setText(
                Html.fromHtml("<u>Login</u>", Html.FROM_HTML_MODE_LEGACY)
        );

        txtLogin.setOnClickListener(v -> {
            Intent intent = new Intent(RegisterActivity.this,
                    LoginActivity.class);
            startActivity(intent);
        });

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(v -> {
            String username = etUsername.getText().toString().trim();
            String password = etPassword.getText().toString().trim();

            if(username.isEmpty() || password.isEmpty()){
                ToastHelper.show(this,
                        "Please fill all fields!",
                        R.drawable.ic_error);
            }
            else{
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                intent.putExtra("toast_message", "Register successful!");
                startActivity(intent);
                finish();
            }
        });
    }
}