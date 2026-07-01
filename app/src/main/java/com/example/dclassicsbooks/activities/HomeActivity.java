package com.example.dclassicsbooks.activities;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.dclassicsbooks.R;
import com.example.dclassicsbooks.utils.ToastHelper;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        String message = getIntent().getStringExtra("toast_message");
        if(message != null){
            ToastHelper.show(
                    this,
                    message,
                    R.drawable.ic_success
            );
        }
    }
}