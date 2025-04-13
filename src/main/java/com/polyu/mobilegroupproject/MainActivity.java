package com.polyu.mobilegroupproject;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private static final int SPLASH_DELAY = 2000; // 2 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        
        // Get the root view instead of using specific ID
        View rootView = findViewById(android.R.id.content);
        ViewCompat.setOnApplyWindowInsetsListener(rootView, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        
        // Delayed navigation to MenuActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Change this to LoginActivity if you want login functionality
                // startActivity(new Intent(MainActivity.this, LoginActivity.class));
                
                // Or go directly to MenuActivity if login is not required
                startActivity(new Intent(MainActivity.this, MenuActivity.class));
                finish();
            }
        }, SPLASH_DELAY);
    }
}