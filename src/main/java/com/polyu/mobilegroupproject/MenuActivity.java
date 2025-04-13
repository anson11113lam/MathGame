package com.polyu.mobilegroupproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        
        // Set welcome message
        TextView welcomeText = findViewById(R.id.welcomeTextView);
        welcomeText.setText("Welcome to Mini Games!");
        
        // Set up click listeners for game cards
        setupGameCards();
    }
    
    private void setupGameCards() {
        // Math Game card click listener
        CardView mathGameCard = findViewById(R.id.mathGameCard);
        mathGameCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, GameMainActivity.class));
            }
        });
        
        // More game card listeners can be added here for other games
    }
}